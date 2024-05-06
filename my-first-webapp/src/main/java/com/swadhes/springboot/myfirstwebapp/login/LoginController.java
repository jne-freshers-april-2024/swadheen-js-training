package com.swadhes.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class LoginController {

    private Logger logger= (Logger) LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String gotoLoginpage(@RequestParam String name, ModelMap model){
        model.put("name",name);
        return "login";
    }
}
