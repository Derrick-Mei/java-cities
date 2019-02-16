package com.lambdaschool.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@Slf4j
@RestController
public class AgCityController
{
    private final AcCityRepository cityrepos;
    private final RabbitTemplate rt;

    public AgCityController(AcCityRepository cityrepos, RabbitTemplate rt)
    {
        this.cityrepos = cityrepos;
        this.rt = rt;
    }

/*
/cities/afford ->
put all secret messages on the secret queue
put all NON secret messages with affordability index < 6 in the cities1 queue
put all other messages in the cities2 queue
*/
    @GetMapping("/cities/afford")
    public void citiesAfford()
    {
        ArrayList<AbCity> cities = new ArrayList<>(cityrepos.findAll());

        log.info("\n\n Sending Msg from ================= /cities/afford =====================");

        for (AbCity c : cities)
        {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final AeCityMessage message = new AeCityMessage(c.toString(), rand, randBool);


            if (randBool)
            {
                rt.convertAndSend(AaJavacitiesApplication.SECRET_QUEUE, message);
            }
            else if (c.getAffordabilityIndex() < 6)
            {
                rt.convertAndSend(AaJavacitiesApplication.CITIES1_QUEUE, message);
            }
            else
            {
                rt.convertAndSend(AaJavacitiesApplication.CITIES2_QUEUE, message);
            }

        }
    }

/*
/cities/homes ->
put all secret messages on the secret queue
put all NON secret messages with home prices > 200000 in the cities1 queue
put all other messages in the cities2 queue
*/
    @GetMapping("cities/homes")
    public void citiesHomes()
    {
        ArrayList<AbCity> citiesHomes = new ArrayList<>(cityrepos.findAll());

        log.info("\n\n Sending Msg from ================= /cities/homes =====================");

        for (AbCity c : citiesHomes)
        {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final AeCityMessage message = new AeCityMessage(c.toString(), rand, randBool);


            if (randBool)
            {
                rt.convertAndSend(AaJavacitiesApplication.SECRET_QUEUE, message);
            }
            else if (c.getMedianHomePrice() > 200000)
            {
                rt.convertAndSend(AaJavacitiesApplication.CITIES1_QUEUE, message);
            }
            else
            {
                rt.convertAndSend(AaJavacitiesApplication.CITIES2_QUEUE, message);
            }

        }
    }

/*
/cities/names ->
put all secret messages on the secret queue
put all NON secret messages the cities1 queue
put nothing in the cities2 queue
 */
    @GetMapping("cities/names")
    public void citiesNames()
    {
        ArrayList<AbCity> citiesNames = new ArrayList<>(cityrepos.findAll());

        log.info("\n\n Sending Msg from ================= /cities/names =====================");

        for (AbCity c : citiesNames)
        {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final AeCityMessage message = new AeCityMessage(c.toString(), rand, randBool);


            if (randBool)
            {
                rt.convertAndSend(AaJavacitiesApplication.SECRET_QUEUE, message);
            }
            else
            {
                rt.convertAndSend(AaJavacitiesApplication.CITIES1_QUEUE, message);
            }

        }
    }


}







//package com.lambdaschool.javacities;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//@Slf4j
//@RestController
//public class AgCityController
//{
//    private final AcCityRepository cityrepos;
//    private final RabbitTemplate rt;
//
//    public AgCityController(AcCityRepository cityrepos, RabbitTemplate rt)
//    {
//        this.cityrepos = cityrepos;
//        this.rt = rt;
//    }
//
//
//    @GetMapping("/cities/afford")
//    public void citiesAfford()
//    {
//        ArrayList<AbCity> cities = new ArrayList<>(cityrepos.findAll());
//
//        ArrayList<AeCityMessage> secretList = new ArrayList<>();
//        ArrayList<AeCityMessage> cities1List = new ArrayList<>();
//        ArrayList<AeCityMessage> cities2List = new ArrayList<>();
//
//        for (AbCity c : cities)
//        {
//            int rand = new Random().nextInt(10);
//            boolean randBool = new Random().nextBoolean();
//            final AeCityMessage message = new AeCityMessage(c.toString(), rand, randBool);
//
//
//            log.info("Sending Msg from /cities/afford");
//
//            if (randBool)
//            {
//                secretList.add(message);
//            }
//            else if (c.getAffordabilityIndex() < 6)
//            {
//                cities1List.add(message);
//            }
//            else
//            {
//                cities2List.add(message);
//            }
//
//        }
//        for (int i = 0; i < 2;)
//        {
//        secretList.forEach( o -> rt.convertAndSend(AaJavacitiesApplication.SECRET_QUEUE, o));
//        i++;
//        cities1List.forEach( o -> rt.convertAndSend(AaJavacitiesApplication.CITIES1_QUEUE, o));
//        i++;
//        cities2List.forEach( o -> rt.convertAndSend(AaJavacitiesApplication.CITIES2_QUEUE, o));
//
//        }
//    }
//
////    @GetMapping("cities/homes")
//
//}


