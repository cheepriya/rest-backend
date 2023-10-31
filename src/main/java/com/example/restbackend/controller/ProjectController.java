package com.example.restbackend.controller;

import com.example.restbackend.model.RegistrationForm;
import com.example.restbackend.repository.RegistrationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView submitRegistrationForm(@RequestBody RegistrationForm registrationForm) {
        // Save the submitted registration form to the database
        RegistrationForm savedForm = registrationFormRepository.save(registrationForm);
//        return savedForm;
        return new RedirectView("/success");
    }

    @GetMapping("/success")
    public String successPage() {
        return "success.html"; // This corresponds to the "success.html" page
    }
}

