package com.ali.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.text.html.parser.Entity;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.ali.config.EntityManagerFactoryUtil;
import com.ali.dao.PatientDao;
import com.ali.model.Patient;

public class PatientDaoJPAImpl implements PatientDao {

	private EntityManagerFactory emf;

	private PatientDaoJPAImpl() {
		this.emf = EntityManagerFactoryUtil.getEntityManagerFactory();
	}

	@Override
	public Patient save(Patient p) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		p = em.merge(p);
		transaction.commit();
		em.close();

		System.out.println("in save dao");
		return p;
	}

	@Override
	public List<Patient> getPatient() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		List<Patient> l = em.createQuery("FROM Patient", Patient.class).getResultList();
		
		transaction.commit();
		em.close();
		return l;

	};

	@Override
	public Patient findById(int id) {
	
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Patient p  = em.find(Patient.class, id);
		transaction.commit();
		em.close();
		return p;
		
	}
	@Override
	public Patient update(Patient p) {
		return save(p);
		
	}

	@Override
	public Patient deleteById(int id) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Patient p = em.find(Patient.class, id);
		em.remove(p);
		transaction.commit();
		em.close();
		return p;
		
	}
}
