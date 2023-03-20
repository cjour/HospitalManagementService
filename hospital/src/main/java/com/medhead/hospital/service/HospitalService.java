package com.medhead.hospital.service;

import com.medhead.hospital.entity.Hospital;
import com.medhead.hospital.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService implements IHospitalService{

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

    @Override
    public Optional<Hospital> findById(Integer id) {
        return hospitalRepository.findById(id);
    }
}
