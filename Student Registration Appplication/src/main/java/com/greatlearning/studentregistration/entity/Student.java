package com.greatlearning.studentregistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_info")
public class Student {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "f_name")
	private String f_name;
	
	@Column(name = "l_name")
	private String l_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "branch_name")
	private String branch_name;
	
	@Column(name ="country")
	private String country;

	public Student(String f_name, String l_name, String email, String branch_name, String country) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.branch_name = branch_name;
		this.country = country;
	}
 
	public Student() {
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", branch_name="
				+ branch_name + ", country=" + country + "]";
	}
	
	
}

