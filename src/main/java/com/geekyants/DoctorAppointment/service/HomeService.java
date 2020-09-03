package com.geekyants.DoctorAppointment.service;

import com.geekyants.DoctorAppointment.entity.Doctor;
import com.geekyants.DoctorAppointment.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService implements IHomeService {
    @Autowired
    private DoctorRepository doctorRepository;


    @Override
    public List<Doctor> listDoctors() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Doctor listDoctorsByID(int id) throws Exception {
        return doctorRepository.findById(id).orElseThrow(Exception::new);
    }
}
