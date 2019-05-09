package com.hcl.inghackathon.service;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

	String doPayment(Long partyId, String approvalStatus, String bankAcccount);
	
}