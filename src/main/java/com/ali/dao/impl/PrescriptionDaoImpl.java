package com.ali.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.ali.config.EntityManagerFactoryUtil;
import com.ali.dao.PrescriptionDao;
import com.ali.model.Patient;
import com.ali.model.Prescription;

public class PrescriptionDaoImpl implements PrescriptionDao {

	private EntityManagerFactory emf;

	private PrescriptionDaoImpl() {
		this.emf = EntityManagerFactoryUtil.getEntityManagerFactory();
	}

	@Override
	public List<Prescription> getPrescriptions(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Patient p = em.find(Patient.class, id);
		List<Prescription> l =  p.getPrescriptions();
		transaction.commit();
		em.close();
		return l;	
	}

	
	/*
	 * @Override public Patient deleteById(int id) {
	 * 
	 * EntityManager em = emf.createEntityManager(); EntityTransaction transaction =
	 * em.getTransaction(); transaction.begin(); Patient p = em.find(Patient.class,
	 * id); em.remove(p); transaction.commit(); em.close(); return p;
	 * 
	 * }
	 */
}
