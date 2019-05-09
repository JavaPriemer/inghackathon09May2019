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
	public List<?> getListOfServiceTransactions(@Param("party") Long partyId,
			@Param("transaction") String transactionStatus);

	@Query(value = "select count(*) from source " + "where product_id = :product " + "and party = :party "
			+ "and  activity = :activity " + "and actual_status = :status;", nativeQuery = true)
	public Integer getActivityCount(@Param("product") Long productId, @Param("party") String partyName,
			@Param("activity") String activityName, @Param("status") Integer actualStatus);

	@Query(value = "select * from source where transaction_status='V'", nativeQuery = true)
	public List<Source> findByTransactionStatus();

}