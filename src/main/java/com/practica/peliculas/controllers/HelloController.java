package com.practica.peliculas.controllers;

import com.practica.peliculas.interfaces.AIService;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    private final AIService aiService;

    public HelloController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/")
    public String hello() {
        return this.aiService.generateGreeting()    ;
    }
}
