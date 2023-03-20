package com.medhead.hospital.controller;

import com.medhead.hospital.entity.Hospital;
import com.medhead.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class HospitalController {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(HospitalController.class));
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospital/list")
    public List<Hospital> findAll() {
        List<Hospital> hospitals = hospitalService.findAll();
        LOGGER.info(hospitals.size() + " hospital(s) found in database");
        return hospitalService.findAll();
    }

    @GetMapping("/hospital/{id}")
    public Optional<Hospital> findById(@PathVariable("id") Integer id) {
        Optional<Hospital> hospital = hospitalService.findById(id);
        LOGGER.info(
                "Name : " + hospital.get().getOrganisationName()
                + " Latitude : " + hospital.get().getLatitude()
                + " Longitude : " + hospital.get().getLongitude()
        );
        return hospitalService.findById(id);
    }
}
