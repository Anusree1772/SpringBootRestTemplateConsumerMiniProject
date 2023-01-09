package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

  @RequestMapping("/createStudent")
  public String createStudent()
  {
     int i=500;
	  return null;
  }
}
