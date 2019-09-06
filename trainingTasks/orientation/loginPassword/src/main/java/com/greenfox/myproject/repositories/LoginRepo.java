package com.greenfox.myproject.repositories;

import com.greenfox.myproject.models.LoginForm;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepo extends CrudRepository<LoginForm,Long> {
}
