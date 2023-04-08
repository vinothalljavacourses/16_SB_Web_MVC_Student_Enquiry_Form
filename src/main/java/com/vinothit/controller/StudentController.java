package com.vinothit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vinothit.entity.Course;
import com.vinothit.entity.Student;
import com.vinothit.repository.GenderRepository;
import com.vinothit.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		
		System.out.println("StudentController() method is successfully loaded....");
		
		formInitBinding(model);
		
		return "index";
	}

	//@InitBinder
	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("genderList", studentService.getGenders());
		model.addAttribute("courseList", studentService.getCourses());
		model.addAttribute("timingsList", studentService.getTimings());
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student student, Model model) {
		
		System.out.println("saveStudent() method is called...");
		//System.out.println("student :: " + student);
		//System.out.println("model :: " + model);
    	boolean isSaved = studentService.saveStudent(student);
		
		if(isSaved) {
			model.addAttribute("success", "Saved Successfully....");
		}
		
		formInitBinding(model);
			
		return "index";
		
	}

}
