package com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)   //one table in db for entire hiererachy
public class Payment {

    @Id
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
