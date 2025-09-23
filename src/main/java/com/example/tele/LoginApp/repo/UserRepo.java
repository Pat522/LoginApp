package com.example.tele.LoginApp.repo;

import com.example.tele.LoginApp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Person, Integer>
{
    Optional<Person> findByEmail(String email);
}

