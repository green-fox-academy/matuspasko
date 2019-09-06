package com.greenfox.securitycourse.servicies;

import com.greenfox.securitycourse.models.User;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

public interface UeserDetailsService {

    Optional<String> loadUserByUsername(String username) throws UserPrincipalNotFoundException;

}
