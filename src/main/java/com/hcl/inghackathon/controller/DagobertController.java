package com.hcl.inghackathon.controller;

import java.util.List;

import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.entities.Transaction;
import com.hcl.inghackathon.model.TransactionModel;
import com.hcl.inghackathon.service.CommissionService;
import com.hcl.inghackathon.service.PaymentApprovalServcice;
import com.hcl.inghackathon.service.SourceService;

@RestController
@RequestMapping("/dagobert")
public class DagobertController {

	@Autowired
	SourceService serviceOne;

	@Autowired
	CommissionService serviceFour;
	
	@Autowired
	PaymentApprovalServcice paymentservice;
	

	@GetMapping("/viewAllServiceTransactions")
	public List<Source> getAllServiceTransactions(@RequestParam("partyId") Long partyId,
			@RequestParam("actualStatus") Integer actualStatus) {
		List<Source> allPendingTransactions = serviceOne.getAllPendingTransactions(partyId, actualStatus);
		return allPendingTransactions;
	}

	@GetMapping("/calculateCommission")
	public Double calculateCommission(@RequestParam("partyId") Long partyId,
			@RequestParam("activityCode") Long activityCode, @RequestParam("productCode") Long productCode) {
		Double calculatedCommission = serviceFour.getCalculatedCommission(partyId, activityCode, productCode);
		return calculatedCommission;
	}
	
	@GetMapping("/getPendingPayments")
	public List<Transaction> getPaymentToApprove(@RequestParam("partyId") Long partyId) {
		List<Transaction> approvedList = paymentservice.getPendingPayments(partyId);
		return approvedList;
	}
	
	@PostMapping("/approvePayment")
	public boolean approvePayment(@RequestBody Transaction transaction) {
		boolean status = paymentservice.approvePayments(transaction);
		return status;
	}
	
	

}