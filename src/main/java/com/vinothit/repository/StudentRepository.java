package com.vinothit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinothit.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
