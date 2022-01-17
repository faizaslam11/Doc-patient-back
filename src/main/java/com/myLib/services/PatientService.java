package com.myLib.services;

import com.myLib.repo.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLib.model.Doctor;
import com.myLib.model.Patient;
@Service
public class PatientService {
	private final PatientRepo pRepo;
	public DoctorRepo dRepo;
	@Autowired
	public PatientService(PatientRepo pRepo, DoctorRepo drepo) {
		this.pRepo = pRepo;
		this.dRepo= drepo;
	}
	
	public String addPatient(Patient p)
	{
		Doctor doc= dRepo.getById(p.getDoctorName());
		int m= doc.getPatientAtteneded();
		doc.setPatientAtteneded(m+1);
		dRepo.save(doc);
		p.setDoctorName(doc.getDoctorName());
		pRepo.save(p);
		return "Appointment Book";
	}

	public List<Patient> findallPatient()
	{
		return pRepo.findAll();
		
	}
	public void updatePatientAttended(Patient d)
	{
		pRepo.save(d);
	}
	
	public Patient findPatient(String name)
	{
		return pRepo.findByPatientName(name);
	}
	
	public void deletePatient(String id)
	{
		pRepo.deleteById(id);
	}
}
