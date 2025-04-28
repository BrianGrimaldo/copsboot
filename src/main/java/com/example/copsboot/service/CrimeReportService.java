package com.example.copsboot.service;

import com.example.copsboot.model.CrimeReport;
import com.example.copsboot.repository.CrimeReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrimeReportService {

    private final CrimeReportRepository crimeReportRepository;

    public CrimeReportService(CrimeReportRepository crimeReportRepository) {
        this.crimeReportRepository = crimeReportRepository;
    }

    public CrimeReport createReport(CrimeReport crimeReport) {
        return crimeReportRepository.save(crimeReport);
    }

    public List<CrimeReport> getAllReports() {
        return crimeReportRepository.findAll();
    }

    public Optional<CrimeReport> getReportById(Long id) {
        return crimeReportRepository.findById(id);
    }
}
