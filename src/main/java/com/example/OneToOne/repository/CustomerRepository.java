package com.example.OneToOne.repository;

import com.example.OneToOne.domain.bidirection.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
