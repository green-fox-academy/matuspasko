package com.greenfox.demo.servicies;

import com.greenfox.demo.models.Url;
import com.greenfox.demo.repositories.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UrlServiceImpl implements UrlService {

    private UrlRepo urlRepo;

    @Autowired
    public UrlServiceImpl(UrlRepo urlRepo){
        this.urlRepo = urlRepo;
    }

    @Override
    public void saveUrl(Url url) {
        urlRepo.save(url);
    }


}
