package com.example.restbackend.controller;

import com.example.restbackend.model.RegistrationForm;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/registrationpage")
    public List<RegistrationForm> registrationDetails(){
        return
    }
=======
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

>>>>>>> 9af10b64cdfbbc57a34a80bf3b7ccfd9cd8cbd09
}
