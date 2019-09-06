package com.greenfox.shortening.servicies;

import com.greenfox.shortening.models.Url;
import com.greenfox.shortening.repositories.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
