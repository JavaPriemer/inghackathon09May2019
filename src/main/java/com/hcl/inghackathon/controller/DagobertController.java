package com.hcl.inghackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.service.CommissionService;
import com.hcl.inghackathon.service.SourceService;

@RestController
@RequestMapping("/dagobert")
public class DagobertController {

	@Autowired
	SourceService serviceOne;

	@Autowired
	CommissionService serviceFour;

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

}