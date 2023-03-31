package com.admin.microservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.admin.microservice.entity.EmployeeDetails;

public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetails,String> {

	@Query(value="SELECT * FROM employee_details WHERE name=?",nativeQuery = true)
	public List<EmployeeDetails> findByName(String name);

	@Query(value="SELECT * FROM employee_details WHERE manager=?",nativeQuery = true)
	public List<EmployeeDetails> findByManager(String manager);
	@Query(value="SELECT * FROM employee_details WHERE id=?",nativeQuery=true)
	public EmployeeDetails getById(String id);
	
	@Query(value="SELECT * FROM employee_details WHERE is_manager=1",nativeQuery = true)
	public List<EmployeeDetails> findAllManager();
}
