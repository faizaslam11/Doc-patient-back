package com.myLib;

import com.myLib.repo.*;
import com.myLib.model.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCases {

	@Autowired
	DoctorRepo dRepo;
	@Autowired
	PatientRepo pRepo;
	Doctor d;
	
	@BeforeEach
	void setUp()
	{
		d=new Doctor();
		d.setDoctorId("12345678");
		d.setDoctorName("Dr A Kumar");
		d.setDoctorGender('M');
		d.setDoctorAge("45");
		d.setSpecialistField("Heart");
	}
	@Test
	void test() {
		assertNotNull(dRepo.findById("17359909"));
	}
	
	@Test
	void test1()
	{
		assertNotNull(dRepo.save(d));
	}
	
	@Test
	void test3()
	{
		assertNotNull(pRepo.findById("15555132"));
	}
	
}

