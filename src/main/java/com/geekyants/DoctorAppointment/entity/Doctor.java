package com.geekyants.DoctorAppointment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "doctor")
@NoArgsConstructor
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctorID")
    int doctorID;
    @Column(name = "doctorname")
    String doctorname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressID", referencedColumnName = "addressID")
    Address address;
    @Column(name = "contact")
    String contact;
    @Column(name = "qualification")
    String qualification;
    @Column(name = "contactduration")
    String contactduration;
    @OneToMany(mappedBy = "doctor")
    Set<Slots> slots;

}
