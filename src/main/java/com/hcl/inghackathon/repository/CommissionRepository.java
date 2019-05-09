package com.hcl.inghackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Commission;

@Repository
public interface CommissionRepository extends JpaRepository<Commission, Long> {

	@Query(value = "select commission from commission where product_code = :product and party_id = :party and activity_id = :activity", nativeQuery = true)
	public Double getCommission(@Param("product") Long productId, @Param("party") Long partyId,
			@Param("activity") Long activityId);

	@Query(value = "update source set processing_status = 'processed' where party_id = :party and activity_code = :activity and product_code = :product and transaction_status = 'V'", nativeQuery = true)
	public void updateProcessingStatus(@Param("party") Long partyId, @Param("activity") Long activityCode,
			@Param("product") Long productCode);

}