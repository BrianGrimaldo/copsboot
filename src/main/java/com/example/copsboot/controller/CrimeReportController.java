package com.example.copsboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrimeReportController {

    @GetMapping("/api/crimes")
    public String getCrimes() {
        return "Lista de crímenes reportados.";
    }
}
