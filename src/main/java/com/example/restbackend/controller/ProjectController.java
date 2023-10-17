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

    @PostMapping("/registration_page/create")
    public ResponseEntity<RegistrationForm> createRegForm(@RequestBody RegistrationForm registrationForm) {
        // Validate the request, handle data, and save to the database
        if (registrationForm == null) {
            // Handle invalid request
            return ResponseEntity.badRequest().body(null);
        }

        // You may want to add validation for the fields here

        RegistrationForm savedForm = registrationFormRepository.save(registrationForm);

        // Return the saved object along with a 201 Created status
        return ResponseEntity.status(HttpStatus.CREATED).body(savedForm);
    }

}
