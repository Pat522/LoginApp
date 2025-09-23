package com.example.tele.LoginApp.service;

import com.example.tele.LoginApp.model.Person;
import com.example.tele.LoginApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@Service
public class UserService {
    private final UserRepo repo;

    @Autowired
    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public String register(@RequestBody Person person) {
        if (repo.findByEmail(person.getEmail()).isPresent())
            return "User already exists";
        else
            repo.save(person);
        return "User registered successfully";
    }

    public String login(Map<String, String> map) {
        String email = map.get("email");
        String password = map.get("password");

        Person person = repo.findByEmail(email).orElse(null);
       if (person == null)
        {
            return " Email is incorrect";
        }
        if (!person.getPassword().equals(password)) {
            return "Password is incorrect";
        }
        return "User logged in successfully, welcome to Santosh" ;
    }
}







