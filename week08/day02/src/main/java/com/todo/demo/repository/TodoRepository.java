package com.todo.demo.repository;

import com.todo.demo.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sun.awt.SunHints;

import java.util.List;


public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query(value = "select * from todo t where t.title = :input ", nativeQuery = true)
    List<Todo> search(@Param("input")String input);

//    List<Todo> findByTitle(String title); // finByTitle je meno ktore nam urcila Java takye yaleyi na nasich pomenovaniach

}


