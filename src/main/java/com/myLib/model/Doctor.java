package com.myLib.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor{
	@Id
	private String doctorId;
	private String doctorName;
	private String doctorAge;
	private char doctorGender;
	private String specialistField;
	private int patientAtteneded;
	public int getPatientAtteneded() {
		return patientAtteneded;
	}
	public void setPatientAtteneded(int patientAtteneded) {
		this.patientAtteneded = patientAtteneded;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(String doctorAge) {
		this.doctorAge = doctorAge;
	}
	public char getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(char doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getSpecialistField() {
		return specialistField;
	}
	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}

}
