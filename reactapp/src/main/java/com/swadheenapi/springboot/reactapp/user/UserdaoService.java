package com.swadheenapi.springboot.reactapp.user;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserdaoService {

    private static List<User> users= new ArrayList<>();
    static {
        users.add(new User(1,"swadheen", LocalDate.now().minusYears(30)));
        users.add(new User(2,"sumita", LocalDate.now().minusYears(20)));

    }
    public List<User> findAll(){
        return users;
    }
 }
