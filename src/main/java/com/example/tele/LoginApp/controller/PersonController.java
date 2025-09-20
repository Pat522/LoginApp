package com.example.tele.LoginApp.controller;

import com.example.tele.LoginApp.model.Person;
import com.example.tele.LoginApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final UserService service;

    @Autowired
    public PersonController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public String register(@RequestBody Person person) {
        return service.register(person);
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> map) {
        return service.login(map);
    }
}



