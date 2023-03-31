package com.admin.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.microservice.entity.AdminDetails;

public interface AdminDetailsRepo extends JpaRepository<AdminDetails, String> {

}
