package com.todo.demo.repository;

import com.todo.demo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TodoRepository extends CrudRepository<Todo, Long> {

}

