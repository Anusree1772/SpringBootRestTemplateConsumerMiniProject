package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Student;
import com.app.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	IStudentService service;
	
	@GetMapping("/register")
	public String showRegPage()
	{
		
		return "StudentRegistration";
	}

	@PostMapping("/create")
	public String createStudent(@ModelAttribute Student s,Model model)
	{
		Integer id=service.saveStudent(s);
		
		System.out.println(s);
		
		String message=new StringBuffer().append("STUDENT '")
				.append(id).append("' CREATED").toString();
		model.addAttribute("message",message);
		
		return "StudentRegistration";
	}
	
	@GetMapping("/all")
	public String getAllStudents()
	{
	
		return "";
	}
}
