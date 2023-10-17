package com.example.restbackend.repository;

import com.example.restbackend.model.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {
}
