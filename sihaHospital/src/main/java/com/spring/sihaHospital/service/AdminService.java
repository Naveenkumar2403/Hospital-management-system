package com.spring.sihaHospital.service;

import java.util.List;

import com.spring.sihaHospital.entity.Admin;
import com.spring.sihaHospital.entity.User;

public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
