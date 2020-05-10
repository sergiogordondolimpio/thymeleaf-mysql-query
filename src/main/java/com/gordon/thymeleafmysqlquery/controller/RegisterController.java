package com.gordon.thymeleafmysqlquery.controller;

import com.gordon.thymeleafmysqlquery.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String registerForm(Model model){

        model.addAttribute("user", new User());
        return "views/registerForm";
    }
}
