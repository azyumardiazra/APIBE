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

    @Column(name = "second_chanche")
    private String secondChance;

    @Column(name = "on_serving")
    private Boolean onServe;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User userQueue;

    public Queue() {
    }

    public Queue(Long idqueue, Long queuenumber, String secondChance, Boolean onServe, Long userid, User userQueue) {
        this.idqueue = idqueue;
        this.queuenumber = queuenumber;
        this.secondChance = secondChance;
        this.onServe = onServe;
        this.userQueue = userQueue;
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

    public String getSecondChance() {
        return secondChance;
    }

    public void setSecondChance(String secondChance) {
        this.secondChance = secondChance;
    }

    public Boolean getOnServe() {
        return onServe;
    }

    public void setOnServe(Boolean onServe) {
        this.onServe = onServe;
    }


    public User getUserQueue() {
        return userQueue;
    }

    public void setUserQueue(User userQueue) {
        this.userQueue = userQueue;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "idqueue=" + idqueue +
                ", queuenumber=" + queuenumber +
                ", secondChance='" + secondChance + '\'' +
                ", onServe=" + onServe +
                ", userQueue=" + userQueue +
                '}';
    }
}


