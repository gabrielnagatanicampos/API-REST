package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController

public class Linkedin {
    @GetMapping("/linkedin")
    public RedirectView linkedin(){
        return new RedirectView("https://www.linkedin.com/in/gabriel-nagatani");
    }

}
