package com.sunware.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController{

    @RequestMapping("/index")
    public String index(){
        return "Hello SpringBoot!";
    }

}
