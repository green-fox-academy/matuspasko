package com.greenfox.demo.repositories;

import com.greenfox.demo.models.Url;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepo extends CrudRepository<Url,Long> {
}
