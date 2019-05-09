package com.hcl.inghackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Source;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {

	@Query(value = "select party_id, product_code, activity_code, count(transaction_status) as transaction_count from source where party_id = :party and transaction_status = :transaction group by party_id, product_code, activity_code", nativeQuery = true)
	public List<?> getListOfActivityCount(@Param("party") Long partyId, @Param("transaction") String transactionStatus);

	@Query(value = "select party_id, product_code, activity_code, count(transaction_status) as transaction_count from source where product_code = :product and party_id = :party and activity_code = :activity and transaction_status = :trxStatus group by party_id, product_code, activity_code", nativeQuery = true)
	public Integer getActivityCount(@Param("product") Long productId, @Param("party") Long partyId,
			@Param("activity") Long activityCode, @Param("trxStatus") String transactionStatus);

	@Query(value = "select * from source where transaction_status='V'", nativeQuery = true)
	public List<Source> findByTransactionStatus();

}