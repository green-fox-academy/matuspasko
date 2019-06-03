package com.todo.demo.controllers;

import com.todo.demo.models.Todo;
import com.todo.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller

public class TodoController {

    TodoRepository repo;


    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }

    @GetMapping("/seed") //to impelement data
    public String seed() {
        this.repo.save(new Todo("Clean table", true, true));
        this.repo.save(new Todo("Learn", true, true));
        this.repo.save(new Todo("Work OUT", true, false));
        this.repo.save(new Todo("Do homework", false, false));
        this.repo.save(new Todo("Finish", true, false));

        return "todolist";

    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        repo.deleteById(id);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String goToAdd(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "add";
    }

    @PostMapping("/search")
    public String searchInTodo(Model model, @RequestParam(required = false) String search) {
        model.addAttribute("todos", repo.search(search));
        return "todolist";
    }

    @GetMapping("/{id}/edit")
    public String editTodoList(Model model, @PathVariable long id) {
        model.addAttribute("todo", repo.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String addEdit(@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}


