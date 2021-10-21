package com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.repos;


import com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}   //we can now perform crud operation for our payment
