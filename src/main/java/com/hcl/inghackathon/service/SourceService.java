package com.hcl.inghackathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Source;

@Service
public interface SourceService {

	public List<?> getAllPendingTransactions(Long partyId, String transactionStatus);
	
	public Integer getActivityCount(Long productId, String party, String activity, Integer actualStatus);
	
	public List<Source> getSuccessfulTransactions();
	
}