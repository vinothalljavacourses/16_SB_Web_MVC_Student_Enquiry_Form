package com.vinothit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinothit.entity.Gender;


public interface GenderRepository extends JpaRepository<Gender, Integer> {

}
