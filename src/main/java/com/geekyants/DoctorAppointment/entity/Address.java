package com.geekyants.DoctorAppointment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressID")
    private int addressID;
    @Column(name = "addressline1")
    private String addressline1;
    @Column(name = "addressline2")
    private String addressline2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;
    @Column(name = "pin")
    private String pin;
    @OneToOne(mappedBy = "address")
    private Doctor doctor;

}
