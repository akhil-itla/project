package com.ams.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@Column(name = "AdminId", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AdminId;
	@NotEmpty(message="firstName cannot be empty")
	@Column(name = "firstName", length = 50)
	private String firstName;
	@NotEmpty(message="lastName cannot be empty")
	@Column(name = "lastName", length = 50)
	private String lastName;
	@Column(name = "age", length = 2)
	private int age;
	@NotEmpty(message="gender cannot be empty")
	@Column(name = "gender", length = 10)
	private String gender;
	@NotEmpty(message="please enter the dob")
	@Column(name = "dob", length = 10)
	private String dob;
	@NotEmpty(message="Contact Number cannot be empty")
	@Column(name = "contactNumber", length = 10)
	private String contactNumber;
	@NotEmpty(message="please enter the alternate Contact Number")
	@Column(name = "altContactNumber", length = 10)
	private String altContactNumber;
	@NotEmpty(message="Emailid cannot be empty")
	@Column(name = "emailId", length = 50)
	private String emailId;
	@Size(min=5,message="Min 5 chars required")
	@Column(name = "password", length = 15)
	private String password;

}
