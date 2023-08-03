package com.api.crud.controller;

import com.api.crud.Model.Task;
import com.api.crud.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String holamundo(){
        return "primer holas mundo!!";
    }

    @GetMapping(value = "/task")
    public List <Task> getTsks(){

        return todoRepository.findAll();
    }
}
