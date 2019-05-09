package com.hcl.inghackathon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Transaction;
import com.hcl.inghackathon.model.TransactionModel;
import com.hcl.inghackathon.repository.TransactionRepository;
import com.hcl.inghackathon.service.PaymentApprovalServcice;

@Service
public class PaymentApprovalServceImpl implements PaymentApprovalServcice {
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<Transaction> getPendingPayments(Long partyId) {
		List<Transaction> list = transactionRepository.getOfUnapprovedTransactions(partyId);
		return list;
	}

	@Override
	public boolean approvePayments(Transaction transaction) {
		boolean staus = false;
		try {
			staus = false;
			transaction.setApprovalStatus("approved");
			transactionRepository.save(transaction);
		} catch (Exception ex) {
			staus = false;
		}
		return staus;
	}

}
