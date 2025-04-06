package service;

import java.util.List;

import dto.EquipementDTO;

public interface EquipementService {
    List<EquipementDTO> getAllEquipements();
    EquipementDTO getEquipementById(Long id);
    EquipementDTO saveEquipement(EquipementDTO equipement);
    EquipementDTO updateEquipement(Long id, EquipementDTO equipement);
    void deleteEquipement(Long id);
}