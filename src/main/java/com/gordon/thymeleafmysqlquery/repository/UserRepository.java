package com.gordon.thymeleafmysqlquery.repository;

import com.gordon.thymeleafmysqlquery.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
