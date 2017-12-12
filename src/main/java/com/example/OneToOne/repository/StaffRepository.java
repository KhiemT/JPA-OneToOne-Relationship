package com.example.OneToOne.repository;

import com.example.OneToOne.domain.bidirection.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 12/12/2017.
 */
public interface StaffRepository extends JpaRepository <Staff, Long>{
}
