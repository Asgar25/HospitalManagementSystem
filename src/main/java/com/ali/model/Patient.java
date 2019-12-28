package com.ali.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Patient {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String gender;
	private String email;

	@OneToMany(fetch = FetchType.EAGER)
	List<Prescription> prescriptions;
}
