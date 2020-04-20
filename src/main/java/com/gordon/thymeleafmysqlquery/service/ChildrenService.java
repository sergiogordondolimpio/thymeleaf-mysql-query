package com.gordon.thymeleafmysqlquery.service;

import com.gordon.thymeleafmysqlquery.model.Children;
import com.gordon.thymeleafmysqlquery.repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepository childrenRepository;

    public List<Children> getAll(){
        return (List<Children>) childrenRepository.findAll();
    }
}
