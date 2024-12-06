package com.aja.taskwithspring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloConfiguration{

    @Bean
    public SDKAWS sdkAWS() {
        return new SDKAWS();
    }

}