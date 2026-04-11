package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController

public class GitHub {
    @GetMapping("/github")

    public RedirectView github(){
        return new RedirectView ("https://github.com/gabrielnagatanicampos/invest-system");
    }

}
