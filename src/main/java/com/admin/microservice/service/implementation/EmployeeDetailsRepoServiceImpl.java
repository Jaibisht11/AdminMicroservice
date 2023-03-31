package com.admin.microservice.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.admin.microservice.entity.Employee;
import com.admin.microservice.entity.EmployeeDetails;
import com.admin.microservice.repository.EmployeeDetailsRepo;
import com.admin.microservice.repository.EmployeeLeaveRepo;
import com.admin.microservice.repository.EmployeeLoginRepo;
import com.admin.microservice.service.EmployeeDetailsRepoService;

@Service
public class EmployeeDetailsRepoServiceImpl implements EmployeeDetailsRepoService {

	@Autowired
	EmployeeDetailsRepo employeeRepo;

	@Autowired
	EmployeeLoginRepo emploginRepo;

	@Autowired
	EmployeeLeaveRepo empleaveRepo;

	public String addEmployee(Employee e) {
		emploginRepo.save(e.getEmplogin());
		employeeRepo.save(e.getEmpdetails());
		empleaveRepo.saveAll(e.getEmpleave());
		return "EMPLOYEE ADDED";

	}

	@Override
	public List<EmployeeDetails> addAllEmployees(List<EmployeeDetails> e) {
		List<EmployeeDetails> emp = employeeRepo.saveAll(e);
		return emp;
	}

	@Override
	public List<EmployeeDetails> getAllManager() {

		return employeeRepo.findAllManager();
	}

	@Override
	public EmployeeDetails getEmployeeById(String id) {

		return employeeRepo.getById(id);
	}

	@Override
	public List<EmployeeDetails> getEmployeeByName(String name) {

		return employeeRepo.findByName(name);
	}

	@Override
	public List<EmployeeDetails> getEmployeeByManager(String manager) {

		return employeeRepo.findByManager(manager);
	}

	@Override
	public EmployeeDetails updateEmployee(EmployeeDetails e) {

		return employeeRepo.save(e);
	}

	@Override
	public String deleteEmployee(String id) {
		employeeRepo.deleteById(id);
		return "Employee with Id" + " " + id + " " + "Deleted";
	}

}
