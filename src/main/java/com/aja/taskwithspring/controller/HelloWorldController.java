package com.aja.taskwithspring.controller;

import com.aja.taskwithspring.service.HelloWorldService;

import com.aja.taskwithspring.domain.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController{

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld(){
        return helloWorldService.helloworld("Anania Augusto");
    }

    @PostMapping
    public String helloworldPost(@RequestBody User body) {
        return "Hello world" + body.getName();
    }

    @PostMapping("/{id}")
    public String helloworldPostId(@PathVariable("id") String id, @RequestBody User body) {
        return "Hello world" + body.getName() + id;
    }

}