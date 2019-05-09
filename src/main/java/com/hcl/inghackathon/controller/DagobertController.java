package com.hcl.inghackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.model.Response;
import com.hcl.inghackathon.service.CommissionService;
import com.hcl.inghackathon.service.SourceService;

@RestController
@RequestMapping("/dagobert")
public class DagobertController {

	@Autowired
	SourceService sourceService;

	@Autowired
	CommissionService commissionService;

	/*
	 * @GetMapping("/viewAllServiceTransactions") public List<Source>
	 * getAllServiceTransactions(@RequestParam("partyId") Long partyId,
	 * 
	 * @RequestParam("actualStatus") Integer actualStatus) { List<Source>
	 * allPendingTransactions = sourceService.getAllPendingTransactions(partyId,
	 * actualStatus); return allPendingTransactions; }
	 */

	@GetMapping("/getServicesProvided")
	public ResponseEntity<List<?>> getServicesProvided(@RequestParam("partyId") Long partyId,
			@RequestParam("transactionStatus") String transactionStatus) {
		List<?> allPendingTransactions = sourceService.getAllPendingTransactions(partyId, transactionStatus);
		return new ResponseEntity<List<?>>(allPendingTransactions, HttpStatus.OK);
	}

	@GetMapping("/getSuccessfulProviders")
	public List<Source> getSuccessfulProviders() {
		return sourceService.getSuccessfulTransactions();
	}

	@GetMapping("/calculateCommission")
	public Double calculateCommission(@RequestParam("partyId") Long partyId,
			@RequestParam("activityCode") Long activityCode, @RequestParam("productCode") Long productCode) {
		Double calculatedCommission = commissionService.getCalculatedCommission(partyId, activityCode, productCode);
		return calculatedCommission;
	}

}