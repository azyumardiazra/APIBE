package com.kelompoktiga.demo.model;

import jakarta.persistence.*;


public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Long idfeedback;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User userFeedback;

    @OneToOne
    @JoinColumn(name = "customer_number", referencedColumnName = "customer_number")
    private Customer feedbackCustomer;

    @OneToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    private Branch branchFeedback;

    public Feedback() {
    }

    public Feedback(Long idfeedback, User userFeedback, Customer feedbackCustomer) {
        this.idfeedback = idfeedback;
        this.userFeedback = userFeedback;
        this.feedbackCustomer = feedbackCustomer;
    }

    public Long getIdfeedback() {
        return idfeedback;
    }

    public void setIdfeedback(Long idfeedback) {
        this.idfeedback = idfeedback;
    }

    public User getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(User userFeedback) {
        this.userFeedback = userFeedback;
    }

    public Customer getFeedbackCustomer() {
        return feedbackCustomer;
    }

    public void setFeedbackCustomer(Customer feedbackCustomer) {
        this.feedbackCustomer = feedbackCustomer;
    }

    public Branch getBranchFeedback() {
        return branchFeedback;
    }

    public void setBranchFeedback(Branch branchFeedback) {
        this.branchFeedback = branchFeedback;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "idfeedback=" + idfeedback +
                ", userFeedback=" + userFeedback +
                ", feedbackCustomer=" + feedbackCustomer +
                ", branchFeedback=" + branchFeedback +
                '}';
    }
}
