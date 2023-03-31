package com.admin.microservice.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.admin.microservice.entity.Employee;
import com.admin.microservice.entity.EmployeeDetails;

public interface EmployeeDetailsRepoService {
	
	public String addEmployee(Employee e);
	public List<EmployeeDetails> addAllEmployees(List<EmployeeDetails> e);
	
	public List<EmployeeDetails> getAllManager();
	public EmployeeDetails getEmployeeById(String id);
	public List<EmployeeDetails> getEmployeeByName(String name);
	public List<EmployeeDetails> getEmployeeByManager(String manager);
	
	public String deleteEmployee(String id);
	
	
	public EmployeeDetails updateEmployee(EmployeeDetails e);
	

}
