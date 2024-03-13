package com.kelompoktiga.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Long idbranch;
    @Column(name = "longitude")
    private BigDecimal longitude;
    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "address")
    private String address;

    @Column(name = "branch_name")
    private String branchName;

    @OneToOne(mappedBy = "branchFeedback")
    private Feedback feedbackBranch;

    public Branch() {
    }

    public Branch(Long idbranch, BigDecimal longitude, BigDecimal latitude, String address, String branchName, Feedback feedbackBranch) {
        this.idbranch = idbranch;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.branchName = branchName;
        this.feedbackBranch = feedbackBranch;
    }

    public Long getIdbranch() {
        return idbranch;
    }

    public void setIdbranch(Long idbranch) {
        this.idbranch = idbranch;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Feedback getFeedbackBranch() {
        return feedbackBranch;
    }

    public void setFeedbackBranch(Feedback feedbackBranch) {
        this.feedbackBranch = feedbackBranch;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "idbranch=" + idbranch +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", address='" + address + '\'' +
                ", branchName='" + branchName + '\'' +
                ", feedbackBranch=" + feedbackBranch +
                '}';
    }
}
