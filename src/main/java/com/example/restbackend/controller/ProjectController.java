package com.example.restbackend.controller;

import com.example.restbackend.model.RegistrationForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    @GetMapping("/registrationpage")
    public List<RegistrationForm> registrationDetails(){
        return
    }
}
