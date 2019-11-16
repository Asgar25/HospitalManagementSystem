package com.ali.model;


import javax.persistence.Entity;
import javax.persistence.Id;

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
}
