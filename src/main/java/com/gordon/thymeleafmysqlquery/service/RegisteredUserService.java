package com.gordon.thymeleafmysqlquery.service;

import com.gordon.thymeleafmysqlquery.model.RegisteredUser;
import com.gordon.thymeleafmysqlquery.repository.RegisteredUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisteredUserService {

    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    public void createUser(RegisteredUser registeredUser){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        registeredUser.setPass(encoder.encode(registeredUser.getPass()));
        registeredUserRepository.save(registeredUser);
    }

    public void createAdmin(RegisteredUser registeredUser){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        registeredUser.setPass(encoder.encode(registeredUser.getPass()));
        registeredUserRepository.save(registeredUser);
    }

    public Optional<RegisteredUser> findOne(int id){
        return registeredUserRepository.findById(id);
    }

    public boolean isUserPresent(String email) {
        RegisteredUser registeredUser = registeredUserRepository.findByEmail(email);
        if (registeredUser!=null)
            return true;
        else
            return false;
    }
}
