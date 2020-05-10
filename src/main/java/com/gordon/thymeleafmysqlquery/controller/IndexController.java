package com.gordon.thymeleafmysqlquery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String showIndexPage(){
        return "index";
    }
}
