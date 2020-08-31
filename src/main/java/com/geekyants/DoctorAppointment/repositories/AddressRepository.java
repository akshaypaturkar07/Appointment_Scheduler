package com.geekyants.DoctorAppointment.repositories;

import com.geekyants.DoctorAppointment.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
