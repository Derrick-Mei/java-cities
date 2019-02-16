// 1

package com.lambdaschool.javacities;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AaJavacitiesApplication
{
    private static final String EXCHANGE_NAME = "LambdaServer";
    public static final String SECRET_QUEUE = "SecretQueue";
    public static final String CITIES1_QUEUE = "Cities_1_Queue";
    public static final String CITIES2_QUEUE = "Cities_2_Queue";

    public static void main(String[] args)
    {
        SpringApplication.run(AaJavacitiesApplication.class, args);
    }

    @Bean
    public TopicExchange appExchange()
    {
        return new TopicExchange(EXCHANGE_NAME);
    }

    // ======================================================

    @Bean
    public Queue appQueueSecret()
    {
        return new Queue(SECRET_QUEUE);
    }

    @Bean
    public Binding declareBindingSecret()
    {
        return BindingBuilder.bind(appQueueSecret()).to(appExchange()).with(SECRET_QUEUE);
    }

    // ======================================================

    @Bean
    public Queue appQueueCities1()
    {
        return new Queue(CITIES1_QUEUE);
    }

    @Bean
    public Binding declareBindingCities1()
    {
        return BindingBuilder.bind(appQueueCities1()).to(appExchange()).with(CITIES1_QUEUE);
    }

    // ======================================================

    @Bean
    public Queue appQueueCities2()
    {
        return new Queue(CITIES2_QUEUE);
    }

    @Bean
    public Binding declareBindingCities2()
    {
        return BindingBuilder.bind(appQueueCities2()).to(appExchange()).with(CITIES2_QUEUE);
    }

    // ======================================================

    @Bean
    public Jackson2JsonMessageConverter producerJackson2MessageConverter()
    {
        return new Jackson2JsonMessageConverter();
    }

}

