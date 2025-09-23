package com.example.tele.LoginApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

    @Entity
    @Component
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    public class Person
    {
        @Id
        private String email;
        private String password;
        private String name;
        private String age;
        private String gender;

    }


