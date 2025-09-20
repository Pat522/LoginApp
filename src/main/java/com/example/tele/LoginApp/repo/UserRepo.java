package com.example.tele.LoginApp.repo;

import com.example.tele.LoginApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Person, Integer> {
    @Query("SELECT p FROM Person p WHERE (p.email=:email) AND (p.password=:password)")
    Optional<Person> findByEmailAndPassword(String email, String password);
}

