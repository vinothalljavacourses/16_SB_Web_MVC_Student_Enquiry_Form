package com.vinothit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vinothit.repository.CourseRepository;
import com.vinothit.repository.GenderRepository;
import com.vinothit.repository.TimingsRepository;

@Controller
public class StudentController {
	
	@Autowired
	private GenderRepository genderRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private TimingsRepository timingsRepo;
	
	@GetMapping("/")
	public ModelAndView getInitialAllData() {
		
		System.out.println("StudentController() method is successfully loaded....");
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Welcome to Student Enquiry Form Page...");
		mav.setViewName("index");
		return mav;
		
		
	}

}
