package com.hcl.inghackathon.service;

import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Transaction;

@Service
public interface TransactionService {

	Transaction getTransaction(Long partyId, String approvalStatus);
	
}