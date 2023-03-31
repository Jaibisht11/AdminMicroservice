package com.admin.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_login")
public class EmployeeLogin {
	
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="password")
	private String password;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public EmployeeLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeLogin(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	

}
