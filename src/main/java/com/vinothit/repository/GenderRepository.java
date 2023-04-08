package com.vinothit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vinothit.entity.Gender;


public interface GenderRepository extends JpaRepository<Gender, Integer> {
	
	@Query(value = "select genderType from Gender", nativeQuery = false)
	public List<String> getAllGenderTypes();

}
