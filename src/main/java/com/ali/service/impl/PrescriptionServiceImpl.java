package com.ali.service.impl;

import java.util.List;

import com.ali.dao.PrescriptionDao;
import com.ali.model.Prescription;
import com.ali.service.PrescriptionService;

public class PrescriptionServiceImpl implements PrescriptionService {

	private PrescriptionDao prescriptionDao;
	
	public List<Prescription> getPrescriptions(int id){
		return prescriptionDao.getPrescriptions(id);
		
	}
	
}
