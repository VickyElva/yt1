package com.yu.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("getMsg")
    public String getMsg(){
        return "This is ServerMsg";
    }
}
