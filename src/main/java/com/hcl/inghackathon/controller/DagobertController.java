package com.hcl.inghackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.service.CommissionService;
import com.hcl.inghackathon.service.PaymentService;
import com.hcl.inghackathon.service.SourceService;

@RestController
@RequestMapping("/dagobert")
public class DagobertController {

	@Autowired
	SourceService sourceService;

	@Autowired
	CommissionService commissionService;

	@Autowired
	PaymentService paymentService;

	@GetMapping("/getActivityCount")
	public ResponseEntity<List<?>> getActivityCount(@RequestParam("partyId") Long partyId,
			@RequestParam("transactionStatus") String transactionStatus) {
		List<?> allPendingTransactions = sourceService.getAllActivityCounts(partyId, transactionStatus);
		return new ResponseEntity<List<?>>(allPendingTransactions, HttpStatus.OK);
	}

	@GetMapping("/getSuccessfulProviders")
	public List<Source> getSuccessfulProviders() {
		return sourceService.getSuccessfulTransactions();
	}

	@GetMapping("/getCommission")
	public Double retrieveCommission(@RequestParam("partyId") Long partyId,
			@RequestParam("activityCode") Long activityCode, @RequestParam("productCode") Long productId,
			@RequestParam("transactionStatus") String transactionStatus) {
		
		Double calculatedCommission = 1.0;
		Double commissionAmount = commissionService.getCommission(partyId, activityCode, productId);
		Integer activityCounts = sourceService.getActivityCount(productId, partyId, activityCode, "V");

		if (activityCounts != null && commissionAmount != null) {
			calculatedCommission = activityCounts * commissionAmount;
			commissionService.updateProcessingStatus(partyId, activityCode, productId);
		}
		
		return calculatedCommission;
	}

	@PostMapping("/makePayment")
	public ResponseEntity<String> makePayment(@RequestParam Long partyId, @RequestParam String approvalStatus,
			@RequestParam String bankAcccount) {
		String msg = paymentService.doPayment(partyId, approvalStatus, bankAcccount);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}