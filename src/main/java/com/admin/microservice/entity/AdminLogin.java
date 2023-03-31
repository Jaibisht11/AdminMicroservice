package com.admin.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_login")
public class AdminLogin {
	
	@Id
	@Column(name="adminId")
	private String adminId;
	@Column(name="adPassword")
	private String adPassword;
	public AdminLogin(String adminId, String adPassword) {
		super();
		this.adminId = adminId;
		this.adPassword = adPassword;
	}
	public AdminLogin() {
		super();
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdPassword() {
		return adPassword;
	}
	public void setAdPassword(String adPassword) {
		this.adPassword = adPassword;
	}
	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", adPassword=" + adPassword + "]";
	}
	
	

}
