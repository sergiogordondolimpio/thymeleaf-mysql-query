package com.gordon.thymeleafmysqlquery.repository;

import com.gordon.thymeleafmysqlquery.model.Monthspay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonthspayRepository extends CrudRepository<Monthspay, Integer> {

    @Query(value =
            "select * from taller_infantil_miramar.monthspay where id_children=?"
            , nativeQuery = true)
    List<Monthspay> findChildrenMonthsPay(int id_children);
}
