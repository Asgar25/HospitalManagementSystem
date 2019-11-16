package com.ali.service;

import java.util.List;

import com.ali.model.Patient;

public interface PatientService {
	
	public Patient save(Patient p);
	public List<Patient> getPatient();
	public Patient findById(int id);
	public Patient update(Patient p);
	public Patient deleteById(int id);

}
