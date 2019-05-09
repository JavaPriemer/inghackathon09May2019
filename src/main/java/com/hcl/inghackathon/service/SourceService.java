package com.hcl.inghackathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Source;

@Service
public interface SourceService {

	public List<?> getAllActivityCounts(Long partyId, String transactionStatus);
	
	public Integer getActivityCount(Long productId, Long party, Long activity, String transactionStatus);
	
	public List<Source> getSuccessfulTransactions();
	
}