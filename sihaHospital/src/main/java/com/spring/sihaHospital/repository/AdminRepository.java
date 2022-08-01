package com.spring.sihaHospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sihaHospital.entity.Admin;
import com.spring.sihaHospital.entity.User;


@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByEmail(String user);
	
	List<Admin> findByRole(String user);
}