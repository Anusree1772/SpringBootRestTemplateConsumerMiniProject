package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

  @RequestMapping("")
  public String createStudent()
  {
<<<<<<< Upstream, based on branch 'master' of https://github.com/Anusree1772/SpringBootRestTemplateConsumerMiniProject
     int i=500;
=======
     int i=1000;
>>>>>>> 05568e0 THIRD COMMIT
	  return null;
  }
}
