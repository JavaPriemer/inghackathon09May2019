package com.hcl.inghackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}