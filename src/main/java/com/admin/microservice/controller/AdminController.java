package com.admin.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.microservice.entity.AdminLogin;
import com.admin.microservice.entity.Employee;
import com.admin.microservice.entity.EmployeeDetails;
import com.admin.microservice.jwt.JwtUtils;
import com.admin.microservice.security.AdminLoginDetails;
import com.admin.microservice.security.AdminLoginDetailsService;
import com.admin.microservice.service.implementation.EmployeeDetailsRepoServiceImpl;
import com.admin.microservice.entity.EmployeeLeave;
import com.admin.microservice.entity.EmployeeLogin;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	
	@Autowired
	EmployeeDetailsRepoServiceImpl empreposerviceimpl;
	
	@Autowired
	AuthenticationManager authmanager;
	
	@Autowired
	JwtUtils jwtutils;
	
	@Autowired
	AdminLoginDetailsService adminlogindetailsservice;
	String TOKEN=null;
	
	@PostMapping("/authenticate")
	public String authenticate(@RequestBody AdminLogin adminlogin)
	{
		
		try {
		Authentication auth=authmanager.authenticate(new UsernamePasswordAuthenticationToken(adminlogin.getAdminId(), adminlogin.getAdPassword()));
		 if(auth.isAuthenticated())
		 {
			 AdminLoginDetails adminlogindetails=(AdminLoginDetails) adminlogindetailsservice.loadUserByUsername(adminlogin.getAdminId()) ;
			  TOKEN =jwtutils.generateJwtToken(adminlogindetails);
			 
		 }
		 return TOKEN;
		
		}catch(Exception e) {
			e.printStackTrace();
			return "AUTHENTICATION FAILED";
		}
		
	}
	
	@PostMapping("/add/employee")
	public EmployeeLogin addEmployee(@RequestBody Employee e) {
		
		String eid = "E" + (int)Math.floor(1000000 + Math.random() * 900000);

		ArrayList<EmployeeLeave> empLeave = new ArrayList<EmployeeLeave>();
		empLeave.add(new EmployeeLeave(e.getEmpdetails().getEmail(), "PL", 5,5));
		empLeave.add(new EmployeeLeave(e.getEmpdetails().getEmail(), "SL", 7,7));

		EmployeeLogin emplogin = new EmployeeLogin(eid, e.getEmpdetails().getDob().replace("-", ""));
		
		e.setEmplogin(emplogin);
		e.getEmpdetails().setId(eid);
		e.setEmpleave(empLeave);
		String RES= empreposerviceimpl.addEmployee(e);
		return emplogin;
		

	}
	
	@PostMapping("/add/manager")
	public String addManager(@RequestBody Employee e) {
		
		String eid = "E" + (int)Math.floor(1000000 + Math.random() * 900000);

		ArrayList<EmployeeLeave> empLeave = new ArrayList<EmployeeLeave>();
		empLeave.add(new EmployeeLeave(e.getEmpdetails().getEmail(), "PL", 5,5));
		empLeave.add(new EmployeeLeave(e.getEmpdetails().getEmail(), "SL", 7,7));

		EmployeeLogin emplogin = new EmployeeLogin(eid, e.getEmpdetails().getDob().replace("-", ""));
		
		e.setEmplogin(emplogin);
		e.getEmpdetails().setId(eid);
		e.getEmpdetails().setIsManager(1);
		e.setEmpleave(empLeave);
		String RES= empreposerviceimpl.addEmployee(e);
		return RES;
		

	}

	@PutMapping("/assign")
	public String assignManager(@RequestBody Employee e) {
		EmployeeDetails empdeDetails=empreposerviceimpl.getEmployeeById(e.getEmpdetails().getId());
		if(empdeDetails.getIsManager()==0) {
			empreposerviceimpl.updateEmployee(e.getEmpdetails());
			return "MANAGER ASSIGNED";
		}
		else {
			return "EMPOYEE IS ALREADY MANAGER";
		}
	}
	
	@GetMapping("/get/manager")
	public List<EmployeeDetails> getAllManager(){
		return empreposerviceimpl.getAllManager();
	}

}
