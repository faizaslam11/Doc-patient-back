package com.myLib.repo;
import com.myLib.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, String> {
    public Patient findByPatientName(String name);
}
