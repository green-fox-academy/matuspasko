package com.example.demo.repositories;


import com.example.demo.models.Link;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LinkRepository extends CrudRepository<Link, Long> {
    Optional<Link> findByAlias(String alias);
}