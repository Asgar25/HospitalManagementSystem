package com.ali.service.impl;

import java.util.List;

import com.ali.dao.PatientDao;
import com.ali.model.Patient;
import com.ali.service.PatientService;

public class PatientServiceImpl implements PatientService {

	private PatientDao patientdao;

	public void setPatientdao(PatientDao patientdao) {
		this.patientdao = patientdao;
	}

	@Override
	public Patient save(Patient p) {

		patientdao.save(p);
		System.out.println("in service:");
		return p;
	}

	@Override
	public List<Patient> getPatient() {
		return patientdao.getPatient();
	}
	
	@Override
	public Patient findById(int id) {
		return patientdao.findById(id);
	}
	@Override
	public Patient update(Patient p) {
		return patientdao.update(p);
	}
	@Override
	public Patient deleteById(int id) {
		return patientdao.deleteById(id);
	}

	
}
