package com.geekyants.DoctorAppointment.service;

import com.geekyants.DoctorAppointment.entity.Doctor;

import java.util.List;

public interface IHomeService {
    List<Doctor> listDoctors();


    Doctor listDoctorsByID(int id) throws Exception;
}
