package com.ali.service;

import java.util.List;

import com.ali.model.Patient;
import com.ali.model.Prescription;

public interface PrescriptionService {
	
	public List<Prescription> getPrescriptions(int id);

}
