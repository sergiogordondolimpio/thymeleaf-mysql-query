package com.gordon.thymeleafmysqlquery.repository;


import com.gordon.thymeleafmysqlquery.model.Children;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends CrudRepository<Children, Integer> {

}
