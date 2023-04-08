package com.vinothit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinothit.entity.Student;
import com.vinothit.entity.StudentEntity;
import com.vinothit.repository.CourseRepository;
import com.vinothit.repository.GenderRepository;
import com.vinothit.repository.StudentRepository;
import com.vinothit.repository.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private GenderRepository genderRepo;
	
	@Autowired
	private TimingsRepository timingsRepo;
	
	@Autowired
	private StudentRepository stundentRepo;
	
	
	public List<String> getCourses(){
		
		List<String> allCourses = courseRepo.getAllCourseNames();
		return allCourses;
		
	}
	
	public List<String> getGenders(){
		List<String> allGenderTypes = genderRepo.getAllGenderTypes();
		return allGenderTypes;
	}
	
	public List<String> getTimings(){
		List<String> allTimings = timingsRepo.getAllTimings();
		return allTimings;
	}
	
	public boolean saveStudent(Student student) {
		
		System.out.println(student);
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		entity.setStudentTimings(Arrays.toString(student.getStudentTimings()));
		System.out.println(entity);
		stundentRepo.save(entity);
		return true;
	}
	
	
	
	
}
