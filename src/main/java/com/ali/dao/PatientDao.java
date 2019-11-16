package com.ali.dao;

import java.util.List;

import com.ali.model.Patient;

public interface PatientDao {
	
	public Patient save(Patient p);
	public List<Patient> getPatient();
	public Patient findById(int id);
	public Patient update(Patient p);
	public Patient deleteById(int id);
}
