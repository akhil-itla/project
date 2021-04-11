package com.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pilots")
public class Pilot {

	@Id
	@Column(name = "pilotId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pilotId;
	
	@Column(name = "planeId", length = 10)
	private int planeId;
	
	@NotEmpty(message="please enter the license Number")
	@Column(name = "licenseNumber", length = 50)
	private String licenseNumber;
	
	@NotEmpty(message="please enter the address")
	@Column(name = "addressLine1", length = 100)
	private String addressLine1;
	
	@Column(name = "addressLine2", length = 100)
	private String addressLine2;
	
	@NotEmpty(message="city cannot be empty")
	@Column(name = "city", length = 50)
	private String city;
	
	@NotEmpty(message="state cannot be empty")
	@Column(name = "state", length = 50)
	private String state;
	
	@NotEmpty(message="zipcode cannot be empty")
	@Column(name = "zipCode", length = 10)
	private String zipCode;
	
	@Column(name = "ssn", length = 50)
	private int ssn;

	}
