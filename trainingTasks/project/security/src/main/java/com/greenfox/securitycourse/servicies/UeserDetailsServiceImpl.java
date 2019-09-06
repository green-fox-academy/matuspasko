package com.greenfox.securitycourse.servicies;

import com.greenfox.securitycourse.models.User;
import com.greenfox.securitycourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class UeserDetailsServiceImpl implements UeserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<String> loadUserByUsername(String username) throws UserPrincipalNotFoundException {
        return userRepository.finByUsername(username);

//        if (user == null)
//            throw new UsernameNotFoundException("Username and or password was incorrect.");

    }
}
