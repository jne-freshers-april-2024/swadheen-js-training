package com.swadheenapi.springboot.reactapp.helloworld.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoservice service;

    private UserResource(UserDaoservice service){
        this.service=service;
    }
    @GetMapping("/users")
    public List<user> retrieveallusers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public List<user> retrieveusers(@PathVariable int id){
        return service.findAll();
    }
}
