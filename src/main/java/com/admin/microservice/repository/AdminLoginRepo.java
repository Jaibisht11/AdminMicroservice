package com.admin.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.microservice.entity.AdminLogin;

public interface AdminLoginRepo extends JpaRepository<AdminLogin, String> {

}
