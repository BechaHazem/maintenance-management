package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Intervention;

public interface InterventionRepository extends JpaRepository<Intervention, Long> {
}