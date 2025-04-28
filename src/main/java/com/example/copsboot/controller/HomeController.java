package com.example.copsboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "🚓 Bienvenido al sistema de reporte de crímenes CopsBoot.";
    }
}
