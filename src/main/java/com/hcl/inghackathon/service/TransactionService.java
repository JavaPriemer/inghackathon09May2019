package com.hcl.inghackathon.service;

import com.hcl.inghackathon.entities.Transaction;

public interface TransactionService {

	Transaction getTransaction(Long partyId, String approvalStatus);
	
}