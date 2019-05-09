package com.hcl.inghackathon.service;

import org.springframework.stereotype.Service;

@Service
public interface CommissionService {

	Double getCommission(Long partyId, Long activityCode, Long productCode);

	void updateProcessingStatus(Long partyId, Long activityCode, Long productCode);

}