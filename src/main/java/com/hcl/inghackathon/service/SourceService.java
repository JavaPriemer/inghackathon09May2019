package com.hcl.inghackathon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Source;

@Service
public interface SourceService {

	public List<Source> getAllPendingTransactions(Long partyId, Integer actualStatus);
	
	public Integer getActivityCount(Long productId, String party, String activity, Integer actualStatus);
	
}