package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Technicien;

public interface TechnicienRepository extends JpaRepository<Technicien, Long> {
}