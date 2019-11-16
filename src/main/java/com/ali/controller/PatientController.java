package com.ali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ali.model.Patient;
import com.ali.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping("/test")
	public String showJSP(Model m) {
		m.addAttribute("patient", new Patient());
		System.out.println("here");
		return "/Patients/save";

	}

	@PostMapping("/add")
	public String save(@ModelAttribute Patient patient) {
		patientService.save(patient);
		System.out.println("inside save ");
		System.out.println(patient);
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showAll(Model m) {
		m.addAttribute("patients", patientService.getPatient());
		return "/Patients/all";
	}

	public String saveHMS(Patient p) {
		return "all";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int id, Model m) {
		m.addAttribute("patient", patientService.findById(id));		
		return "/Patients/edit";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Patient patient) {
		patientService.update(patient);
		System.out.println("inside save ");
		System.out.println(patient);
		return "redirect:all";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id) {
		patientService.deleteById(id);		
		return "redirect:all";
	}
	
	
	
}
