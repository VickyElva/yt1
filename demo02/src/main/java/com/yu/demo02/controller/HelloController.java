package com.yu.demo02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    public String say() {
        System.out.println(123);
        return "hello world";
    }
}
