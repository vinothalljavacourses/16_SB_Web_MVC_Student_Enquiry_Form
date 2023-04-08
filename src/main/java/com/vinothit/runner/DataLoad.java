package com.vinothit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vinothit.entity.Course;
import com.vinothit.entity.Gender;
import com.vinothit.entity.Timings;
import com.vinothit.repository.CourseRepository;
import com.vinothit.repository.GenderRepository;
import com.vinothit.repository.TimingsRepository;

@Component
public class DataLoad implements ApplicationRunner{
	

	@Autowired
	private GenderRepository genderRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private TimingsRepository timingsRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
      System.out.println("This DataLoad class is going to load only one time while application initially starts for student enquiry form....");
      
      genderRepo.deleteAll();
      courseRepo.deleteAll();
      timingsRepo.deleteAll();
      
      // Adding Gender Types into Database
		
		Gender gendertype1 = new Gender();
		gendertype1.setGenderType("Male");

		Gender gendertype2 = new Gender();
		gendertype2.setGenderType("Fe-Male");

		List<Gender> allGenderTypes = Arrays.asList(gendertype1, gendertype2);

		List<Gender> allGendersInsertionStatus = genderRepo.saveAll(allGenderTypes);

		System.out.println("Gender Data :: " + allGendersInsertionStatus + " loaded successfully");
		 
      
      //Adding Course Types into Database
		
		Course course1 = new Course();
		course1.setCourseName("Spring");

		Course course2 = new Course();
		course2.setCourseName("Hibernate");

		Course course3 = new Course();
		course3.setCourseName("SpringBoot");

		Course course4 = new Course();
		course4.setCourseName("AWS");

		Course course5 = new Course();
		course5.setCourseName("DevOps");

		List<Course> allCourses = Arrays.asList(course1, course2, course3, course4, course5);

		List<Course> allCoursesInsertionStatus = courseRepo.saveAll(allCourses);

		System.out.println("Courses Data :: " + allCoursesInsertionStatus + " loaded successfully");
		 
      
      
      //Adding Timings into Database
		
		Timings timing1 = new Timings();
		timing1.setTimingsName("Morning");

		Timings timing2 = new Timings();
		timing2.setTimingsName("AfterNoon");

		Timings timing3 = new Timings();
		timing3.setTimingsName("Evening");

		List<Timings> allTimings = Arrays.asList(timing1, timing2, timing3);

		List<Timings> alltimingsInstertionStatus = timingsRepo.saveAll(allTimings);

		System.out.println("Timings Data :: " + alltimingsInstertionStatus + " loaded successfully");
		 
      
      
      
		
	}

}
