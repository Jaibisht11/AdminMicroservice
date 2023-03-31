package com.admin.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.microservice.entity.EmployeeLeave;

public interface EmployeeLeaveRepo extends JpaRepository<EmployeeLeave,String> {

}
