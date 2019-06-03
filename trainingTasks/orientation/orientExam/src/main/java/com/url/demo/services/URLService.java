package com.url.demo.services;

import com.url.demo.UrlApplication;
import com.url.demo.controllers.URLController;
import com.url.demo.models.URLAlias;
import com.url.demo.repositories.UrlRepo;
import org.hibernate.sql.Alias;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class URLService {

    private URLAlias itemToDisplay = new URLAlias();
    private UrlRepo repo;

    public URLService(UrlRepo repo) {
        this.repo = repo;
    }


    public UrlRepo getRepo() {
        return repo;
    }

    public void setRepo(UrlRepo repo) {
        this.repo = repo;
    }

    public URLAlias getItemToDiesplay() {
        return itemToDisplay;
    }

    public void setItemToDiesplay(URLAlias itemToDiesplay) {
        this.itemToDisplay = itemToDiesplay;
    }

    public boolean isAlreadyStored(String alias) {
        Optional<URLAlias> itemWithTheSameAlias = repo.getItemByAlias(alias);
        return itemWithTheSameAlias.isPresent();
    }

    public void save(URLAlias itemTosave) {
        repo.save(itemTosave);
    }

    public String getMessage() {
        if (isAlreadyStored(itemToDisplay.getAlias())) {
            //stored
            return "Your alias is already in use!";
        } else {
            //Not stored
            return "Your url is aliased to"
                    + itemToDisplay.getAlias()
                    + "and your secret code is"
                    + itemToDisplay.getSecretCode();
        }
    }
}
