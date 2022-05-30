package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class StudentController {
	@Autowired
	StudentDAO dao;
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
		
	}

}
