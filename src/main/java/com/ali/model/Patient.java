package com.ali.model;

import lombok.Data;

@Data
public class Patient {

	private int id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String gender;
	private String email;
}
