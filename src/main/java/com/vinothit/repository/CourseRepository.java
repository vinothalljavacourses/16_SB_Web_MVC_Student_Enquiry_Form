package com.vinothit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinothit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
