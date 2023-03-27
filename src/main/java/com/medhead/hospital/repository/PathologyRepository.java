package com.medhead.hospital.repository;

import com.medhead.hospital.entity.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathologyRepository extends JpaRepository<Pathology, Integer> {}