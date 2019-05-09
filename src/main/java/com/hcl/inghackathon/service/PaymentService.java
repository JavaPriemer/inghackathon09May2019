package com.hcl.inghackathon.service;

public interface PaymentService {

	String doPayment(Long partyId, String approvalStatus, String bankAcccount);
	
}