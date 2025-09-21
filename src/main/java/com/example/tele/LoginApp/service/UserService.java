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
        Person person = repo.findByEmailAndPassword (map.get("email"), map.get("password")).orElse(null);
        if (person == null)
        {
            return "Email or password is incorrect";
        }
        return "User logged successfully, welcome to Santosh";
    }
}






