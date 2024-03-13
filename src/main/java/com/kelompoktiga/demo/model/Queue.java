package com.kelompoktiga.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="Queue")
public class Queue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queue_id")
    private Long idqueue;
    @Column(name = "queue_number")
    private Long queuenumber;


    @Column(name = "on_serving")
    private Boolean onServe;

    @Column(name = "user_id")
    private Long userid;


    public Queue() {
    }

    public Queue(Long idqueue, Long queuenumber, String secondChance, Boolean onServe, Long userid) {
        this.idqueue = idqueue;
        this.queuenumber = queuenumber;
        this.onServe = onServe;
        this.userid = userid;
    }

    public Long getIdqueue() {
        return idqueue;
    }

    public void setIdqueue(Long idqueue) {
        this.idqueue = idqueue;
    }

    public Long getQueuenumber() {
        return queuenumber;
    }

    public void setQueuenumber(Long queuenumber) {
        this.queuenumber = queuenumber;
    }

    public Boolean getOnServe() {
        return onServe;
    }

    public void setOnServe(Boolean onServe) {
        this.onServe = onServe;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }



    @Override
    public String toString() {
        return "queue{" +
                "idqueue=" + idqueue +
                ", queuenumber=" + queuenumber +
                ", onServe=" + onServe +
                ", userid=" + userid +
                '}';
    }
}
