package com.connection.demo;

import com.connection.demo.models.Todo;
import com.connection.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {


    @Autowired
    TodoRepository todoRepository;

    public void run(String... args) {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

}
