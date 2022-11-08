package com.yashwanthgajji.greatlearning.collegeevent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private long id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "department")
	private String department;
	@Column(name="country")
	private String country;
	
	public Student(String firstname,String lastname, String department, String country) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.country = country;
	}
}
