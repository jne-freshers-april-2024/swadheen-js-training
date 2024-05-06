package com.example.demo.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age){};

@Configuration
public class HelloWorld {
    
    @Bean
    public String name(){
        return "sWADHEEN";
    }
    @Bean
    public int age(){
        return 20;
    }
}
