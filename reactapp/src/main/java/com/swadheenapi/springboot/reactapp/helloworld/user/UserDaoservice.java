package com.swadheenapi.springboot.reactapp.helloworld.user;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoservice {
    private static List <user> users= new ArrayList<>();
    static {
        users.add(new user(1,"swadheen",LocalDate.now().plusYears(30)));
    }
    public List<user> findAll(){
        return users;
    }
    public user findOne(int id){
        Predicate<? super user> predicate=user -> user.getId().equal(id);
        return  users.stream().filter(predicate).findFirst().get();
    }
}
