package com.gordon.thymeleafmysqlquery.service;

import com.gordon.thymeleafmysqlquery.model.Monthspay;
import com.gordon.thymeleafmysqlquery.repository.MonthspayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthspayService {

    @Autowired
    private MonthspayRepository monthspayRepository;

    public void addMonthsPay(Monthspay monthspay){
        monthspayRepository.save(monthspay);
    }

    public List<Monthspay> findChildrenMonthsPay(int id_children){
        return monthspayRepository.findChildrenMonthsPay(id_children);
    }
}
