package com.vinothit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vinothit.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Integer> {
	
	
	@Query(value = "select timingsName from Timings", nativeQuery = false)
	public List<String> getAllTimings();

}
