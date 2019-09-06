package com.greenfox.aliasurl.repositories;

import com.greenfox.aliasurl.models.Link;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepo extends CrudRepository<Link, Long> {

    Link findByAlias(String alias);

}
