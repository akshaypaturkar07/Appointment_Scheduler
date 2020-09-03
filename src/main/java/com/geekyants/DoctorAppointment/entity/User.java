package com.geekyants.DoctorAppointment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private int userID;
    private String userName;
    private String email;
    private String phonenumber;
    private Date appointmentdate;


}
