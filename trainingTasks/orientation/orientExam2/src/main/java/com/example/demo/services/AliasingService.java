package com.example.demo.services;

import com.example.demo.models.Link;
import javassist.NotFoundException;

public interface AliasingService {
    Link save(Link link);

    Link findByAlias(String alias);

    Iterable<Link> getEveryLink();

    void deleteLink(long id, String secretCode) throws NotFoundException;
}