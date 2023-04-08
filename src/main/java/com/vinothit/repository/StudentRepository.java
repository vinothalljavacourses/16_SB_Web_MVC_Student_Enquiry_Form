package com.vinothit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinothit.entity.Student;
import com.vinothit.entity.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
