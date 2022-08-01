package com.spring.sihaHospital.Controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;

public class SsoController {
	
	@GetMapping("/showMyLoginPage")
	public String home()
	{
		
		return "login";
	}

	@GetMapping("/user/index")
	public Principal user(Principal principal) {
		return principal;
		
	}
	

}
