package com.example.OneToOne.service;

import com.example.OneToOne.domain.bidirection.Customer;
import com.example.OneToOne.domain.bidirection.CustomerRecord;
import com.example.OneToOne.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerData implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setEmail("jack@gmail.com");

        CustomerRecord customerRecord = new CustomerRecord();
        customerRecord.setCustomerRecordId(2L);
        customerRecord.setBillingInformation("123 Main Street, Somewhere, CA 94000");
        customer.setCustomerRecord(customerRecord);
        customerRepository.save(customer);

        customerRepository.findById(1L);

        //customerRepository.delete(customer);
    }
}
