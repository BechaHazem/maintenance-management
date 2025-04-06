package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Panne;

public interface PanneRepository extends JpaRepository<Panne, Long> {
}
