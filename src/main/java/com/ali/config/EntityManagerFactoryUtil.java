package com.ali.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null)
			try {
				emf = Persistence.createEntityManagerFactory("PatientsPersistence");	
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		return emf;
	}
	
	private EntityManagerFactoryUtil() {
		
	}

}
