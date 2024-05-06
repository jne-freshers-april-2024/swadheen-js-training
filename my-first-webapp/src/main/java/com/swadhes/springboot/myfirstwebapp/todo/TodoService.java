package com.swadhes.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1,"swadheen","sethy", LocalDate.now().plusYears(2),false));

    }
    public List <Todo> findbyUsername(String username){
        return todos;
    }
}
