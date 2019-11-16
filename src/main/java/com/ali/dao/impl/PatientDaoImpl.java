package com.ali.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ali.dao.PatientDao;
import com.ali.model.Patient;

public class PatientDaoImpl implements PatientDao {

	private JdbcTemplate jdbcTemp;
	
	public PatientDaoImpl(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	
	}
	
	@Override
	public Patient save(Patient p) {
		
		jdbcTemp.update("INSERT INTO hsm.patient values(?,?,?,?,?,?)",
				p.getId(),
				p.getFirstName(),
				p.getLastName(),
				p.getMobileNumber(),
				p.getGender(),
				p.getEmail() 
				);
		
		System.out.println("in save dao");
		return p;
	}

	@Override
	public List<Patient> getPatient() {
		
		return jdbcTemp.query("SELECT * FROM hsm.patient", new BeanPropertyRowMapper<>(Patient.class));
	};
	
	@Override
	public Patient findById(int id) {
		return jdbcTemp.queryForObject("SELECT * FROM hsm.patient WHERE id=?", new BeanPropertyRowMapper<>(Patient.class), id);
	}
	
	@Override
	public Patient update(Patient p) {
		// DML query
		
		jdbcTemp.update("UPDATE hsm.patient SET firstName=?, lastName=?, mobileNumber=?, gender=?, email=? WHERE id = ?",

				p.getFirstName(),
				p.getLastName(),
				p.getMobileNumber(),
				p.getGender(),
				p.getEmail(),
				p.getId()
				);
		
		System.out.println("in save dao");
		return p;
	}

	@Override
	public Patient deleteById(int id) {
		jdbcTemp.update("DELETE FROM hsm.patient WHERE id=?",id);
		return null;
	}
}
