package com.gordon.thymeleafmysqlquery.controller;

import com.gordon.thymeleafmysqlquery.model.RegisteredUser;
import com.gordon.thymeleafmysqlquery.service.RegisteredUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisteredUserController {
    @Autowired
    private RegisteredUserService registeredUserService;

    @GetMapping("/register")
    public String registerForm(Model model){

        model.addAttribute("registeredUser", new RegisteredUser());
        return "registerForm";
    }

    @PostMapping("/register")
    //@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@Valid RegisteredUser registeredUser,
                               BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "registerForm";
        }
        if (registeredUserService.isUserPresent(registeredUser.getEmail())){
            model.addAttribute("exist", true);

            return "registerForm";
        }
        registeredUserService.createUser(registeredUser);
        return "success";
    }
}
