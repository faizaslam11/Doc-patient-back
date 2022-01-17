package com.myLib.model;
import javax.persistence.*;
@Entity
public class Patient{

	@Id
	private String patientName;
	private int patientAge;
	private char patientGender;
	private String dateOfVisit;
	private String doctorName;
	private String prescription;
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public char getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(char patientGender) {
		this.patientGender = patientGender;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	
}

