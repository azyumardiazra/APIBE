package com.kelompoktiga.demo.controller;

import com.kelompoktiga.demo.Service.CustomerService;
import com.kelompoktiga.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Iterable <Customer> getAllcustomer() {
        return customerService.getAllcustomer();
    }

    @GetMapping("/{customerId}")
    public Customer getcustomerByid(@PathVariable Long id) {
        return customerService.getcustomerByid(id);
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{customerId}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        customer.setIdcustomer(id);
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deletecustomer(id);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getBindingResult().getFieldError().getDefaultMessage());
    }
}
