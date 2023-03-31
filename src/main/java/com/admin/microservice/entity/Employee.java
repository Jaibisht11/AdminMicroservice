package com.admin.microservice.entity;

import java.util.ArrayList;

public class Employee {
	
	private EmployeeDetails empdetails;
	private EmployeeLogin emplogin;
	private ArrayList<EmployeeLeave>  empleave=new ArrayList<EmployeeLeave>();
	
	
	
	public Employee(EmployeeDetails empdetails, EmployeeLogin emplogin, ArrayList<EmployeeLeave> empleave) {
		super();
		this.empdetails = empdetails;
		this.emplogin = emplogin;
		this.empleave = empleave;
	}
	public Employee() {
		
	}
	public EmployeeDetails getEmpdetails() {
		return empdetails;
	}
	public void setEmpdetails(EmployeeDetails empdetails) {
		this.empdetails = empdetails;
	}
	public EmployeeLogin getEmplogin() {
		return emplogin;
	}
	public void setEmplogin(EmployeeLogin emplogin) {
		this.emplogin = emplogin;
	}
	
	
	public ArrayList<EmployeeLeave> getEmpleave() {
		return empleave;
	}
	public void setEmpleave(ArrayList<EmployeeLeave> empleave) {
		this.empleave = empleave;
	}
	
	
	

}
