package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/index")
    public String index(){
        return "Hello from BridgeLabz!!!!!!!!!!!";
    }
}
