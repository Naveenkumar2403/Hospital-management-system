package com.spring.sihaHospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sihaHospital.entity.Appointment;
import com.spring.sihaHospital.entity.User;


@Repository("appointmentRepository")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	
}