package com.medhead.hospital.controller;

import com.medhead.hospital.entity.Hospital;
import com.medhead.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospital/{speciality}")
    public List<Hospital> findBySpeciality(@PathVariable("speciality") String speciality) {
        return hospitalService.findBySpeciality(speciality);
    }

    @GetMapping("/hospital/list")
    public List<Hospital> findAll() {
        return hospitalService.findAll();
    }
}