package com.greenfox.alias.repositories;

import com.greenfox.alias.models.Alias;
import org.springframework.data.repository.CrudRepository;

public interface AliasRepo extends CrudRepository<Alias, Long> {
}
