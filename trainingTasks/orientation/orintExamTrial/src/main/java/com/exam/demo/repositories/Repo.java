package com.exam.demo.repositories;

import com.exam.demo.models.Model;
import org.springframework.data.repository.CrudRepository;

public interface Repo  extends CrudRepository<Model, Long> {
}
