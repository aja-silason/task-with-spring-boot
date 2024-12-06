package com.aja.taskwithspring.controller;

import com.aja.taskwithspring.service.HelloWorldService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController{

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld(){
        return helloWorldService.helloworld("Anania Augusto");
    }

}