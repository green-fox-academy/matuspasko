package com.greenfox.aliasurl.servicies;

import com.greenfox.aliasurl.models.Link;
import com.greenfox.aliasurl.repositories.LinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinkServiceImpl implements LinkService {

    LinkRepo linkRepo;

    @Autowired
    public LinkServiceImpl(LinkRepo linkRepo) {
        this.linkRepo = linkRepo;
    }

    @Override
    public void saveAlias(Link link) {
        if (checkIfAliasExist(link.getAlias())){
            throw new IllegalArgumentException("Your alias is already in use!");
        }
        else {
            linkRepo.save(link);
        }

    }

    @Override
    public Optional<Link> findLink(long id) {
        return linkRepo.findById(id);
    }

    @Override
    public boolean checkIfAliasExist(String alias) {
        return linkRepo.findByAlias(alias) != null;
    }

    @Override
    public Iterable<Link> findAll() {
       return linkRepo.findAll();

    }

    @Override
    public void deleteByIdLink(long id) {
        linkRepo.deleteById(id);
    }

//    @Override
//    public boolean checkIfAliasExist(String alias){
//        if (linkRepo.findByAlias(alias) == null){
//            return false;
//        }
//        return true;
//    }
}
