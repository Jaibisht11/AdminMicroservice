package com.admin.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.microservice.entity.EmployeeLogin;

public interface EmployeeLoginRepo extends JpaRepository<EmployeeLogin,String> {

}
