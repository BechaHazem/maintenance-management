package service;

import java.util.List;

import dto.TechnicienDTO;

public interface TechnicienService {
    List<TechnicienDTO> getAllTechniciens();
    TechnicienDTO getTechnicienById(Long id);
    TechnicienDTO saveTechnicien(TechnicienDTO technicien);
    TechnicienDTO updateTechnicien(Long id, TechnicienDTO technicien);
    void deleteTechnicien(Long id);
}
