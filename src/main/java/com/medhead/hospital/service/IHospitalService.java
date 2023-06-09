package com.medhead.hospital.service;

import com.medhead.hospital.entity.Hospital;

import java.util.List;
import java.util.Optional;

public interface IHospitalService {
    List<Hospital> findAll();
    Optional<Hospital> findById(Integer id);
}
