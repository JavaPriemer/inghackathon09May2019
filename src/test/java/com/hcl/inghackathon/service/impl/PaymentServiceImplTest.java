package com.hcl.inghackathon.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.inghackathon.entities.Transaction;
import com.hcl.inghackathon.repository.TransactionRepository;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class PaymentServiceImplTest {

	@Mock
	TransactionRepository transactionRepository;

	@InjectMocks
	TransactionServiceImpl transactionServiceImpl;

	@Test
	public void transactionPaymentTest() {
		Transaction transaction = new Transaction();
		transaction.setPartyId(101L);
		transaction.setApprovalStatus("approved");
		Mockito.when(transactionRepository.findByPartyIdAndApprovalStatus(transaction.getPartyId(),
				transaction.getApprovalStatus())).thenReturn(transaction);
		Transaction transactionValue = transactionServiceImpl.getTransaction(transaction.getPartyId(),
				transaction.getApprovalStatus());
		Assert.assertEquals(transaction, transactionValue);
	}
}