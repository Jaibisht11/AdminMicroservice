package com.admin.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_details")
public class AdminDetails {
	
	
	@Id
	@Column(name="adminId")
	private String adminId;
	
	@Column(name="adName")
	private String adName;
	@Column(name="adEmail")
	private String adEmail;
	@Column(name="adDob")
	private String adDob;
	@Column(name="adGender")
	private String adGender;
	@Column(name="adContact")
	private String adContact;
	@Column(name="adDateofJoin")
	private String adDateofJoin;
	public AdminDetails(String adminId, String adName, String adEmail, String adDob, String adGender, String adContact,
			String adDateofJoin) {
		super();
		this.adminId = adminId;
		this.adName = adName;
		this.adEmail = adEmail;
		this.adDob = adDob;
		this.adGender = adGender;
		this.adContact = adContact;
		this.adDateofJoin = adDateofJoin;
	}
	public AdminDetails() {
		super();
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdEmail() {
		return adEmail;
	}
	public void setAdEmail(String adEmail) {
		this.adEmail = adEmail;
	}
	public String getAdDob() {
		return adDob;
	}
	public void setAdDob(String adDob) {
		this.adDob = adDob;
	}
	public String getAdGender() {
		return adGender;
	}
	public void setAdGender(String adGender) {
		this.adGender = adGender;
	}
	public String getAdContact() {
		return adContact;
	}
	public void setAdContact(String adContact) {
		this.adContact = adContact;
	}
	public String getAdDateofJoin() {
		return adDateofJoin;
	}
	public void setAdDateofJoin(String adDateofJoin) {
		this.adDateofJoin = adDateofJoin;
	}
	@Override
	public String toString() {
		return "AdminDetails [adminId=" + adminId + ", adName=" + adName + ", adEmail=" + adEmail + ", adDob=" + adDob
				+ ", adGender=" + adGender + ", adContact=" + adContact + ", adDateofJoin=" + adDateofJoin + "]";
	}
	
	
	
	


}
