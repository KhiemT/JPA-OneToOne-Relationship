package com.example.OneToOne.repository;

import com.example.OneToOne.domain.unidirection.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
