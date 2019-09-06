package com.greenfox.shortening.repositories;

import com.greenfox.shortening.models.Url;
import org.springframework.data.repository.CrudRepository;

public interface UrlRepo extends CrudRepository<Url,Long> {
}
