package service;

import java.util.List;

import dto.PanneDTO;
import model.Panne;

public interface PanneService {
	    List<PanneDTO> getAllPannes();
	    PanneDTO getPanneById(Long id);
	    PanneDTO savePanne(PanneDTO panneDTO);
	    PanneDTO updatePanne(Long id, PanneDTO panneDTO);
	    void deletePanne(Long id);
}