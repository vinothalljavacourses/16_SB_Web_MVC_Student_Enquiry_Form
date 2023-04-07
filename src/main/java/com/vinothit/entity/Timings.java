package com.vinothit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="timings_tbl")
public class Timings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer timingsId;
	private String timingsName;
}
