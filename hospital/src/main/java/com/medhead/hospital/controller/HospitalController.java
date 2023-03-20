package com.medhead.hospital.controller;

import com.medhead.hospital.entity.Hospital;
import com.medhead.hospital.service.HospitalService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class HospitalController {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(HospitalController.class));
    @Autowired
    private HospitalService hospitalService;

    @RequestMapping("/hospital/list")
    public List<Hospital> findAll() {
        List<Hospital> hospitals = hospitalService.findAll();
        LOGGER.info("/hospital/list -> " + hospitals.size() + "hospital(s) found");
        return hospitalService.findAll();
    }
}
