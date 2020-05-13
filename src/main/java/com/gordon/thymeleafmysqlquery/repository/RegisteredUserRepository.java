package com.gordon.thymeleafmysqlquery.repository;

import com.gordon.thymeleafmysqlquery.model.RegisteredUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisteredUserRepository extends CrudRepository<RegisteredUser, Integer> {
    RegisteredUser findByEmail(String email);
}
