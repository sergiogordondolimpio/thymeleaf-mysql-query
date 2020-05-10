package com.gordon.thymeleafmysqlquery.service;

import com.gordon.thymeleafmysqlquery.model.User;
import com.gordon.thymeleafmysqlquery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPass(encoder.encode(user.getPass()));
        userRepository.save(user);
    }

    public void createAdmin(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPass(encoder.encode(user.getPass()));
        userRepository.save(user);
    }

    public Optional<User> findOne(int id){
        return userRepository.findById(id);
    }
}
