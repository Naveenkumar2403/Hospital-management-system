package com.spring.sihaHospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class SihaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SihaApplication.class, args);
	}

}
