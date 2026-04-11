package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class Portfolio {
    @GetMapping("/portfolio")
    public RedirectView portfolio(){
        return new RedirectView("https://cut-bird-e14.notion.site/Portf-lio-Engenharia-de-Software-Dados-2b406a3beb3f83ef8fa081b71d877a3b");
    }
}
