package com.swadhes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    public TodoController(TodoService todoService){
        super();
        this.todoService=todoService;
    }
    @RequestMapping("list-todos")
    public String listAlltodos(){
        return "list-todos";
    }
}
