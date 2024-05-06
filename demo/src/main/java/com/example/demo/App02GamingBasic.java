package com.example.demo;

import com.example.demo.helloworld.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasic {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(HelloWorld.class);
       System.out.println(context.getBean("name"));
       System.out.println(context.getBean("age"));

    }
}
