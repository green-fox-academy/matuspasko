package com.url.demo.repositories;

import com.url.demo.models.URLAlias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UrlRepo extends CrudRepository<URLAlias, String> {
    @Query(value = "select * from SQLalias where alias.alias = ?1 ", nativeQuery = true)
    Optional<URLAlias> getItemByAlias (String alias);

}



