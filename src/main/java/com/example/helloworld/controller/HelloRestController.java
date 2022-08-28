package com.example.helloworld.controller;

import com.example.helloworld.data.Entity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value={"/home","/"},method = RequestMethod.GET)
public class HelloRestController {

    @GetMapping(path="/{name}")
    public String getName(@RequestParam(value = "name", defaultValue = "Sneha") String name){
        return "<h1>Hii "+name+" ! Welcome to BridgeLabz!</h1>";
    }
    @RequestMapping(value = {"/{name}/{email}"},method = RequestMethod.GET)
    public String getEmail(@PathVariable String email){
        return "<h1>Your "+email+" ID is required!</h1>";
    }
    @PostMapping("/post")
    public String post(@RequestBody Entity entity){
        return "Welcome "+entity.getFirstName()+" "+entity.getLastName()+"!!!";
    }
}
