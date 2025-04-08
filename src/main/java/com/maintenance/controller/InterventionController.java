package com.maintenance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maintenance.dto.InterventionDTO;
import com.maintenance.service.InterventionService;

@RestController
@RequestMapping("/interventions")
public class InterventionController {

	@Autowired
	private InterventionService interventionService;

	@GetMapping("/get-all")
	public List<InterventionDTO> getAllInterventions() {
		return interventionService.getAllInterventions();
	}

	@GetMapping("/{id}")
	public InterventionDTO getInterventionById(@PathVariable Long id) {
		return interventionService.getInterventionById(id);
	}

	@PostMapping("/create")
	public InterventionDTO saveIntervention(@RequestBody InterventionDTO intervention) {
		return interventionService.saveIntervention(intervention);
	}

	@PutMapping("/{id}")
	public InterventionDTO updateIntervention(@PathVariable Long id, @RequestBody InterventionDTO intervention) {
		return interventionService.updateIntervention(id, intervention);
	}

	@DeleteMapping("/{id}")
	public void deleteIntervention(@PathVariable Long id) {
		interventionService.deleteIntervention(id);
	}
}
