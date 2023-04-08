package com.vinothit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vinothit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	@Query(value = "select courseName from Course", nativeQuery = false)
	public List<String> getAllCourseNames();

}
