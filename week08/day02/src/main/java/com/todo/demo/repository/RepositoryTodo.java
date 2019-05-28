package com.todo.demo.repository;

import com.todo.demo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTodo extends CrudRepository<Todo, Long> {
}
