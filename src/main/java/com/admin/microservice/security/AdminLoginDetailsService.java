package com.admin.microservice.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.admin.microservice.entity.AdminLogin;
import com.admin.microservice.repository.AdminLoginRepo;

@Service
public class AdminLoginDetailsService implements UserDetailsService {

	@Autowired
	AdminLoginRepo adminLoginRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AdminLogin adminLogin=adminLoginRepo.findById(username).get();
		return new AdminLoginDetails(adminLogin);
	}

}
