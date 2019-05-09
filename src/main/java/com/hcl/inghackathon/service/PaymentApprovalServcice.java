package com.hcl.inghackathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Transaction;

@Service
public interface PaymentApprovalServcice {
	
	public List<Transaction> getPendingPayments(Long patryId);

	public boolean approvePayments(Transaction transaction);


}
