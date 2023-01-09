package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

  @RequestMapping("")
  public String createStudent()
  {
     int i=50;
	  return null;
  }
}
