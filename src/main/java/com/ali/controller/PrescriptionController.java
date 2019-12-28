package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ali.model.Patient;
import com.ali.service.PatientService;

@Controller()
public class PrescriptionController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/allPres")
	public String showAllPrescription(Model m, @RequestParam() int id) {

		// m.addAttribute("prescription", prescriptionService.getPrescriptions(id));
		Patient patient = patientService.findById(id);
		m.addAttribute("patient", patient);
		System.out.println(patient);
		return "/Prescription/all";
	}

}
