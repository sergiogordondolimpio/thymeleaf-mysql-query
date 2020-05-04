package com.gordon.thymeleafmysqlquery.service;

import com.gordon.thymeleafmysqlquery.model.Children;
import com.gordon.thymeleafmysqlquery.repository.ChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepository childrenRepository;


    public List<Children> getAll(){
        return (List<Children>) childrenRepository.findAll();
    }

    public Optional<Children> getOne(Integer Id){
        return childrenRepository.findById(Id);
    }

    public List<Children> byName(String name) {
        return childrenRepository.findByName(name);
    }

    public List<Children> orderByName(String name){
        return childrenRepository.findByNameOrderByInscriptionDesc(name);
    }

    /*
    public Integer countChildren(String name, String regular){
        return childrenRepository.countChildren(name, regular);
    }
     */

    public void addAndUpdate(Children children){
        childrenRepository.save(children);
    }

    public void delete(Children children){
        childrenRepository.delete(children);
    }

    public List<Children> findAName(String name) {
        return childrenRepository.findAName(name);
    }
}
