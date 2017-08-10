package ru.alfabank.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ApplePayController {

    @Autowired
    CardConfiguration configuration;

    @RequestMapping(value = "/cards/{userId}", method = RequestMethod.GET)
    ApplePayCardResponse getCards(@PathVariable Integer userId){

        if (userId > 2000){
            return ApplePayCardResponse
                    .builder()
                    .cards(configuration.getAppleCards())
                    .token(UUID.randomUUID().toString())
                    .build();
        }

        throw new RuntimeException("No cards for this userId");

    }
}
