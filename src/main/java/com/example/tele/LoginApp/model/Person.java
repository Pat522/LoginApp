package com.example.tele.LoginApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

    @Entity
    @Component
    public class Person
    {
        @Id
        private String email;
        private String password;

        public Person(){}

        public Person(String email, String password) {
           // this.name = name;
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }


