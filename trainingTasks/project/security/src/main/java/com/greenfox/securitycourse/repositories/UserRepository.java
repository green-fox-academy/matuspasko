package com.greenfox.securitycourse.repositories;

import com.greenfox.securitycourse.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.rmi.runtime.Log;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<String> finByUsername(String username);
}
