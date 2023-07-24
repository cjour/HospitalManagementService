package com.medhead.hospital.service;

import com.medhead.hospital.entity.Hospital;
import com.medhead.hospital.entity.Pathology;
import com.medhead.hospital.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalService implements IHospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> findBySpeciality(String speciality) {
        List<Hospital> hospitals = hospitalRepository.findAll();
        List<Hospital> pertinentHospitals = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            for (Pathology pathology: hospital.getPathologies()) {
               if (pathology.getName().equals(speciality)) {
                    pertinentHospitals.add(hospital);
               }
            }
        }
        return pertinentHospitals;
    }

    @Override
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }
}
