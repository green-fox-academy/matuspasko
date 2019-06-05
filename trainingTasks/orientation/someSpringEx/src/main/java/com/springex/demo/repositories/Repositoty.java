package com.springex.demo.repositories;

import com.springex.demo.models.Model;
import org.springframework.data.repository.CrudRepository;

public interface Repositoty extends CrudRepository<Model, String> {
}
