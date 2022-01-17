package com.myLib.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.myLib.model.Doctor;
public interface DoctorRepo extends JpaRepository<Doctor, String>{

}
