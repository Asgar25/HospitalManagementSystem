package com.ali.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("PatientsPersistence");
		return emf;
	}
	
	private EntityManagerFactoryUtil() {
		
	}

}
