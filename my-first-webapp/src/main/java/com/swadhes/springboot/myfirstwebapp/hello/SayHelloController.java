package com.swadhes.springboot.myfirstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello-jsp")

    public String sayHelloJsp(@RequestParam String name){
        System.out.println("Request param  is "+ name);
        return "sayHello";
    }
}
