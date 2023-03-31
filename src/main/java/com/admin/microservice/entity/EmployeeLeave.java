package com.admin.microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_leave")
public class EmployeeLeave {
	
	
	
	
	@Id
	@GeneratedValue
	@Column(name="leaveId")
	private long leaveId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="leaveType")
	private String leaveType;
	
	@Column(name="leaveCount")
	private int leaveCount;
	
	

	@Column(name="leaveRemaining")
	private int leaveRemaining;
	
	


	
	public EmployeeLeave(long leaveId, String email, String leaveType, int leaveCount, int leaveRemaining) {
		super();
		this.leaveId = leaveId;
		this.email = email;
		this.leaveType = leaveType;
		this.leaveCount = leaveCount;
		this.leaveRemaining = leaveRemaining;
		
	}

	
	public EmployeeLeave(String email, String leaveType, int leaveCount,int leaveRemaining) {
		super();
		this.email = email;
		this.leaveType = leaveType;
		this.leaveCount = leaveCount;
		this.leaveRemaining=leaveRemaining;
	}



	public EmployeeLeave() {
		super();
	}

	public long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(long leaveId) {
		this.leaveId = leaveId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount) {
		this.leaveCount = leaveCount;
	}

	public int getLeaveRemaining() {
		return leaveRemaining;
	}

	public void setLeaveRemaining(int leaveRemaining) {
		this.leaveRemaining = leaveRemaining;
	}


	@Override
	public String toString() {
		return "EmployeeLeave [leaveId=" + leaveId + ", email=" + email + ", leaveType=" + leaveType + ", leaveCount="
				+ leaveCount + ", leaveRemaining=" + leaveRemaining + "]";
	}
	
	
	

}
