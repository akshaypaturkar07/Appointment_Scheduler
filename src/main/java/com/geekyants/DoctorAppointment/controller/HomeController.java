package com.geekyants.DoctorAppointment.controller;

import com.geekyants.DoctorAppointment.entity.Doctor;
import com.geekyants.DoctorAppointment.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping(value = {"/", "", "/home", "/index"})
    public String indexPage(Model model) {
        List<Doctor> doctors = homeService.listDoctors();
        model.addAttribute("doctor", new Doctor());
        model.addAttribute("doctors", doctors);
        return "index";
    }

    @GetMapping(value = "/loadDoctorDetails")
    public void showDoctorsByID(@RequestParam("id") int id, Model model) throws Exception {
        Doctor doctor = homeService.listDoctorsByID(id);
        model.addAttribute("doctor", doctor);
    }


}
