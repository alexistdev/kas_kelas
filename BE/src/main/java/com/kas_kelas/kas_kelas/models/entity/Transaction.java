package com.kas_kelas.kas_kelas.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="transactions")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int amount;

    private Date date;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name="month_id")
    private MonthEntity monthEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public MonthEntity getMonthEntity() {
        return monthEntity;
    }

    public void setMonthEntity(MonthEntity monthEntity) {
        this.monthEntity = monthEntity;
    }
}
