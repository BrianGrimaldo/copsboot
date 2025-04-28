package com.example.copsboot.controller;

import com.example.copsboot.model.CrimeReport;
import com.example.copsboot.service.CrimeReportService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crimes")
public class CrimeReportController {

    private final CrimeReportService crimeReportService;

    public CrimeReportController(CrimeReportService crimeReportService) {
        this.crimeReportService = crimeReportService;
    }

    @PostMapping
    public ResponseEntity<CrimeReport> createCrime(@Valid @RequestBody CrimeReport crimeReport) {
        CrimeReport createdReport = crimeReportService.createReport(crimeReport);
        return ResponseEntity.ok(createdReport);
    }

    @GetMapping
    public ResponseEntity<List<CrimeReport>> getAllCrimes() {
        return ResponseEntity.ok(crimeReportService.getAllReports());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CrimeReport> getCrimeById(@PathVariable Long id) {
        return crimeReportService.getReportById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
