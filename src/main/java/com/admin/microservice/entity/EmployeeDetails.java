package com.admin.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeDetails {
	
	
	
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")//object relational mapping
	private String id;
	
	@Column(name="name")
	private String name;
	
	
	
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="manager")
	private String manager;
	
	@Column(name="managerId")
	private String managerId;
	
	@Column(name="isManager")
	private int isManager;

	

	

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", mobile="
				+ mobile + ", address=" + address + ", designation=" + designation + ", manager=" + manager
				+ ", managerId=" + managerId + ", isManager=" + isManager + "]";
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

	public EmployeeDetails(String id, String name, String email, String dob, String mobile, String address,
			String designation, String manager, String managerId, int isManager) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.designation = designation;
		this.manager = manager;
		this.managerId = managerId;
		this.isManager = isManager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public EmployeeDetails() {
		
	}

	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	

}
