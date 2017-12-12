package com.example.OneToOne.service;

import com.example.OneToOne.domain.bidirection.LocationDetails;
import com.example.OneToOne.domain.bidirection.ParkingSpot;
import com.example.OneToOne.domain.bidirection.Staff;
import com.example.OneToOne.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

/**
 * Created by admin on 12/12/2017.
 */
@Component
@Transactional
public class StaffData implements CommandLineRunner {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public void run(String... strings) throws Exception {

        LocationDetails location = new LocationDetails();
        location.setOfficeNumber(911);
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setGarage("Hilton Garage");
        location.setParkingSpot(parkingSpot);

        Staff staff = new Staff();
        staff.setLocation(location);
        staffRepository.save(staff);

        /*Staff staff1 = staffRepository.findById(15L)
                .orElseThrow(() -> new EntityNotFoundException());
        System.out.println("Staff Identifier: " + staff1.getId());
        System.out.println("Staff Office No.: " + staff1.getLocation().getOfficeNumber());
        System.out.println("Staff Garage Name: " + staff1.getLocation().getParkingSpot().getGarage() );*/

    }
}
