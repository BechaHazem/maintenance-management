package com.maintenance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maintenance.model.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
}