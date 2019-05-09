package com.hcl.inghackathon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.inghackathon.entities.Source;
import com.hcl.inghackathon.repository.SourceRepository;
import com.hcl.inghackathon.service.SourceService;

@Service
public class SourceServiceImpl implements SourceService {

	@Autowired
	SourceRepository sourceRepo;

	@Override
	public List<?> getAllActivityCounts(Long partyId, String transactionStatus) {
		return sourceRepo.getListOfActivityCount(partyId, transactionStatus);
	}

	@Override
	public Integer getActivityCount(Long productId, Long party, Long activity, String transactionStatus) {
		return sourceRepo.getActivityCount(productId, party, activity, transactionStatus);
	}

	@Override
	public List<Source> getSuccessfulTransactions() {
		return sourceRepo.findByTransactionStatus();
	}

}