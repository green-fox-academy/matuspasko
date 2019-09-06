package com.greenfox.aliasurl.servicies;

import com.greenfox.aliasurl.models.Link;

import java.util.List;
import java.util.Optional;

public interface LinkService {

    void saveAlias(Link link);

    Optional<Link> findLink(long id);

    boolean checkIfAliasExist(String alias);

    Iterable<Link> findAll();

    void deleteByIdLink(long id);

}
