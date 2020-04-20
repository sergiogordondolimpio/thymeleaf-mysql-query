package com.gordon.thymeleafmysqlquery.controller;

import com.gordon.thymeleafmysqlquery.model.Children;
import com.gordon.thymeleafmysqlquery.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequestMapping("/children")
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Children> childrenList = childrenService.getAll();
        model.addAttribute("childrenList", childrenList);
        return "children";
        //return childrenService.getAll();
    }

}
