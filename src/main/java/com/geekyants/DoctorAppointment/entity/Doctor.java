package com.geekyants.DoctorAppointment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
@NoArgsConstructor
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctorID")
    private int doctorID;
    @Column(name = "doctorname")
    private String doctorname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressID", referencedColumnName = "addressID")
    private Address address;
    @Column(name = "contact")
    private String contact;
    @Column(name = "qualification")
    private String qualification;
    @Column(name = "contactduration")
    private String contactduration;

}
