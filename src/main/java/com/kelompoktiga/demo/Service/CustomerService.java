package com.kelompoktiga.demo.Service;

import com.kelompoktiga.demo.Repository.CustomerRepository;
import com.kelompoktiga.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Iterable <Customer> getAllcustomer() {
            return customerRepository.findAll();
    }

    public Customer getcustomerByid(Long id) {

            return customerRepository.findById(id).orElse(null);
    }

    public Customer saveCustomer (Customer customer) {
            return customerRepository.save(customer);
    }

    public void deletecustomer(Long id) {
            customerRepository.deleteById(id);

    }
}
