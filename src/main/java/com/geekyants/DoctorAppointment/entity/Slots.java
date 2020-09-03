package com.geekyants.DoctorAppointment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "slots")
@NoArgsConstructor
@Setter
@Getter
public class Slots {
    @Id
    @Column(name = "slotID")
    private int slotID;
    @ManyToOne
    @JoinColumn(name = "doctorID", nullable = false)
    private Doctor doctor;
    private Date slotStartTime;
    private Date slotEndTime;
    private String slotdescription;


}
