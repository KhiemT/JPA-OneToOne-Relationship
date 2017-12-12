package com.example.OneToOne.service;

import com.example.OneToOne.domain.unidirection.Employee;
import com.example.OneToOne.domain.unidirection.EmployeeInfo;
import com.example.OneToOne.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
public class EmployeeData implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        //employee.setEmployeeId(1L); error
        employee.setName("Peter T");

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setEmployeeInfoId(2L);
        employeeInfo.setJobTitle("Developer");
        employee.setInfo(employeeInfo);
        employeeRepository.save(employee);

        Employee employee1 = employeeRepository.findById(2L)
                .orElseThrow(() -> new EntityNotFoundException());

        System.out.println(employee1.getEmployeeId());
        employeeRepository.delete(employee);
    }
}
