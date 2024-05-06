package com.swadheenapi.springboot.reactapp.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserdaoService service;

    public UserResource (UserdaoService service){
        this.service=service;
    }

    @GetMapping("/users ")
    public List<User> retrieveAllusers(){
        return service.findAll();

    }
}
