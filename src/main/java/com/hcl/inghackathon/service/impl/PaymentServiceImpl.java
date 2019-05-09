package com.hcl.inghackathon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.inghackathon.entities.Payment;
import com.hcl.inghackathon.entities.Transaction;
import com.hcl.inghackathon.repository.PaymentRepository;
import com.hcl.inghackathon.service.PaymentService;
import com.hcl.inghackathon.service.TransactionService;

public class PaymentServiceImpl implements PaymentService {

	@Autowired
	TransactionService transactionService;

	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public String doPayment(Long partyId, String approvalStatus, String bankAcccount) {
		Transaction transaction = new Transaction();
		Payment payment = new Payment();
		transaction = transactionService.getTransaction(partyId, approvalStatus);
		if (transaction.getPartyId() == partyId && transaction.getApprovalStatus().equals(approvalStatus)) {
			payment.setPartyId(transaction.getPartyId());
			payment.setPaymentStatus(transaction.getApprovalStatus());
			payment.setAmountPaid(transaction.getAmountToBePaid());
			payment.setBankAccount(bankAcccount);
			paymentRepository.save(payment);
			return "Payment Successfully done with paty Id" + payment.getPartyId();
		} else
			return "Wrong party id provided";

	}

}