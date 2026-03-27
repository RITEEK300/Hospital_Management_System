package com.example.hms;

import com.example.hms.entity.Patient;
import com.example.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {
    @Autowired
  private PatientRepository patientRepository;

    public void testPatientRepository() {
List<Patient> patientList= patientRepository.findAll();
System.out.println(patientList);
    }
}
