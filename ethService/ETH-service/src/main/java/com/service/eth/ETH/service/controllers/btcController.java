package com.service.eth.ETH.service.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value =  "/api/v1")
public class btcController {

    @GetMapping(value= "/eth", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    String getETH(){
        final String uri = "https://api.bitso.com/v3/ticker/?book=eth_mxn";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }

}
