package com.yu.client1.controller;

import com.yu.client1.client.ServerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getServerResult")
    public String getServerResult(){
        return restTemplate.getForObject("http://server/getMsg", String.class);
    }

    @Autowired
    private ServerClient serverClient;

    @GetMapping("/getServerResult2")
    public String getServerResult2(){
        return serverClient.getMsg();
    }

}
