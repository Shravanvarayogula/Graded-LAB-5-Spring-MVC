package com.greatlearning.studentregistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.studentregistration.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showFrom(Model theModel) {
		Student newStudent = new Student();
		theModel.addAttribute("student", newStudent);
		return "new-registration-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student newStudent) {
		System.out.println("The Student " + newStudent.getF_name());
		return "redirect:registration-confirmation";
	}
	
}