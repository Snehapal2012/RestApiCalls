package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value={"/home","/"},method = RequestMethod.GET)
public class HelloRestController {
    @GetMapping(path="/{name}")
    public String getName(@RequestParam(value = "name", defaultValue = "Sneha") String name){
        return "<h1>Hii "+name+" ! Welcome to BridgeLabz!</h1>";
    }
}
