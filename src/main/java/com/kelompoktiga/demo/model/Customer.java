package com.kelompoktiga.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_number")
    private Long idcustomer;
    @Column(name = "customer_name")
    private String nameCustomer;
    @Column(name = "mpin")
    private Long Mpin;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "customer_phone_number")
    private String customerPhoneNumber;

    @OneToOne(mappedBy = "feedbackCustomer")
    private Feedback customerFeedback;


    public Customer() {
    }

    public Customer(Long idcustomer, String nameCustomer, Long mpin, BigDecimal balance, String customerPhoneNumber) {
        this.idcustomer = idcustomer;
        this.nameCustomer = nameCustomer;
        Mpin = mpin;
        this.balance = balance;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Long getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Long idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Long getMpin() {
        return Mpin;
    }

    public void setMpin(Long mpin) {
        Mpin = mpin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Feedback getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(Feedback customerFeedback) {
        this.customerFeedback = customerFeedback;
    }


}
