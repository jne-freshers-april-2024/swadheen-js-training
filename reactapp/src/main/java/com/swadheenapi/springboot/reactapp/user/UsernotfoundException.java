package com.swadheenapi.springboot.reactapp.user;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UsernotfoundException extends RuntimeException{

    public UsernotfoundException(String message){
        super(message);
    }
}
