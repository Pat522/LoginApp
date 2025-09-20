package com.example.tele.LoginApp.service;

import com.example.tele.LoginApp.model.Person;
import com.example.tele.LoginApp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class UserService {
    private final UserRepo repo;

    @Autowired
    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public String register(Person person) {
        repo.save(person);
        return "User registered successfully";
    }

    public String login(Map<String, String> map) {
        Person person = repo.findByEmailAndPassword(map.get("email"), map.get("password")).orElse(null);
        if (person == null) {
             return "Invalid password";
        }
            return "User logged successfully, welcome to" + person.getName();
       }
}






