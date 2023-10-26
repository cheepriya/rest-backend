package com.example.restbackend.controller;

import com.example.restbackend.model.RegistrationForm;
import com.example.restbackend.repository.RegistrationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Ref;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private RegistrationFormRepository registrationFormRepository;

    @GetMapping("/registration_page")
    public List<RegistrationForm> registrationDetails() {
        return registrationFormRepository.findAll();
    }

    @PostMapping("/submit")
    public RegistrationForm submitRegistrationForm(@RequestBody RegistrationForm registrationForm) {
        // Save the submitted registration form to the database
        System.out.println("json:" + registrationForm.toString());
        RegistrationForm savedForm = registrationFormRepository.save(registrationForm);
        return savedForm;
    }
}

