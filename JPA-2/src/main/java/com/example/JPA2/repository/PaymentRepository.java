package com.example.JPA2.repository;

import com.example.JPA2.entity.Payment;
import org.springframework.data.repository.CrudRepository;



public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}