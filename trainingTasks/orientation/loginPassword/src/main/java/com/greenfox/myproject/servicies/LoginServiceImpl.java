package com.greenfox.myproject.servicies;

import com.greenfox.myproject.repositories.LoginRepo;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    LoginRepo loginRepo;

    public LoginServiceImpl(LoginRepo loginRepo){
        this.loginRepo = loginRepo;
    }
}
