package com.example.restbackend.repository;

import com.example.restbackend.model.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {
}
