package com.gordon.thymeleafmysqlquery.repository;


import com.gordon.thymeleafmysqlquery.model.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChildrenRepository extends CrudRepository<Children, Integer> {

    List<Children> findByName(String name);

    List<Children> findByNameOrderByInscriptionDesc(String name);

    @Query(value =
            "select * from taller_infantil_miramar.children where name like ?1% or surname like ?1% or dni like ?1%"
            , nativeQuery = true)
    List<Children> findAName(String name);

    /*
    @Query("SELECT count(name) FROM taller_infantil_miramar.children where name = ?1 AND regular = ?2")
    Integer countChildren(String name, String regular);

     */
}
