package com.todos.demo.repository;

import com.todos.demo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTodo extends CrudRepository<Todo, Long> {
}
