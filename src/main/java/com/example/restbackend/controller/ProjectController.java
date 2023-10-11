package com.example.restbackend.controller;

import com.example.restbackend.model.RegistrationForm;
import com.example.restbackend.repository.RegistrationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private RegistrationFormRepository registrationFormRepository;

    @GetMapping("/registration_page")
    public List<RegistrationForm> registrationDetails(){
        return registrationFormRepository.findAll();
    }

}
