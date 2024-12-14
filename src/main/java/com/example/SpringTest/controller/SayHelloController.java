package com.example.SpringTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        System.out.println("Checking if the commit triggers the jenkins build or not");
        return "Hello "+name;
    }
}
