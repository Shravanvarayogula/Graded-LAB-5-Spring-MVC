package com.greatlearning.studentregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RegistrationController{
	@RequestMapping("/")
	public String welcome() {
		return "main-menu";
	}
	
	
}


