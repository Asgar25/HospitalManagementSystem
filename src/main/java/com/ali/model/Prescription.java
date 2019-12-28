package com.ali.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Prescription {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double injection;
	private double visitingFees;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	/*
	 * @OneToMany List<Medicine> medicines;
	 */
	
	
}
