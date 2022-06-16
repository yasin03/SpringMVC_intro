package com.tpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tpe.domain.Student;
import com.tpe.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/welcome")
	@ResponseBody 
	public String welcome() {
		return "Welcome to Student Controller";
	}
	
	@RequestMapping(value= "/students", method = RequestMethod.GET)
	public ModelAndView getStudents() {
		List<Student> list = studentService.getAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("students", list);
		mav.setViewName("students");
		return mav;
		
	}
	
	
	
	
	
}
