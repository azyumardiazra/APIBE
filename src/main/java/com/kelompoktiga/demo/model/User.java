package com.kelompoktiga.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long iduser;

    @Column(name = "user_name")
    private  String namauser;

    @Column(name="phone_number")
    private Long phoneNumber;

    @OneToOne(mappedBy = "userFeedback")
    private Feedback feedbackUser;

    @OneToOne(mappedBy = "userQueue")
    private Queue queueUser;


    public User() {
    }

    public User(Long iduser, String namauser, Long phoneNumber) {
        this.iduser = iduser;
        this.namauser = namauser;
        this.phoneNumber = phoneNumber;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getNamauser() {
        return namauser;
    }

    public void setNamauser(String namauser) {
        this.namauser = namauser;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "user{" +
                "iduser=" + iduser +
                ", namauser='" + namauser + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
