package com.hcl.inghackathon.service;

import org.springframework.stereotype.Service;

@Service
public interface CommissionService {

	Double getCalculatedCommission(Long partyId, Long activityCode, Long productCode);

}