package com.ali.dao;

import java.util.List;

import com.ali.model.Prescription;

public interface PrescriptionDao {
	
	public List<Prescription> getPrescriptions(int id);

}
