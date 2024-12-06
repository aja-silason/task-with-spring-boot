package com.aja.taskwithspring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService{
    public String helloworld(String name){
        return "Say hello world " +name;
    }
}
