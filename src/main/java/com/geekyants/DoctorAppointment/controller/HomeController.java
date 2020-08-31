package com.geekyants.DoctorAppointment.controller;

import com.geekyants.DoctorAppointment.entity.Doctor;
import com.geekyants.DoctorAppointment.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @RequestMapping("/")
    public String indexPage() {
        List<Doctor> doctors = homeService.loadHomePage();
        return "index";
    }
}
