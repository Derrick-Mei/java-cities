package com.lambdaschool.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
// Spring will run this in the background
@Service
public class AfCityMessageListener
{
    @RabbitListener(queues = AaJavacitiesApplication.SECRET_QUEUE)
    public void receiveSecretMessage(AeCityMessage scm)
    {
        log.info("Received Secret Message: {}", scm.toString());
    }

    @RabbitListener(queues = AaJavacitiesApplication.CITIES1_QUEUE)
    public void receiveCities1Message(AeCityMessage c1cm)
    {
        log.info("Received Cities 1 Message: {}", c1cm.toString());
    }

    @RabbitListener(queues = AaJavacitiesApplication.CITIES2_QUEUE)
    public void receiveCities2Message(AeCityMessage c2cm)
    {
        log.info("Received Cities 2 Message: {}", c2cm.toString());
    }
}
