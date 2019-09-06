package com.greenfox.alias.servicies;

import com.greenfox.alias.models.Alias;
import com.greenfox.alias.repositories.AliasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasServiceImpl implements AliasService {

    private AliasRepo aliasRepo;

    @Autowired
    public AliasServiceImpl(AliasRepo aliasRepo){
        this.aliasRepo = aliasRepo;
    }

    @Override
    public void saveAlias(Alias alias) {
        aliasRepo.save(alias);

    }
}
