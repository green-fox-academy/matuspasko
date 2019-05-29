package com.connection.demo.controllers;


import com.connection.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class TodoController {

    private TodoRepository repo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }
}
