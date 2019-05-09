package com.hcl.inghackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Source;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {

	@Query(value = "select party_id, product_code, activity_code, count(actual_status) " + "from source "
			+ "where party_id = ?1 " + "and actual_status = ?2"
			+ "group by party_id, product_code, activity_code", nativeQuery = true)
	public List<Source> getListOfServiceTransactions(Long partyId, Integer actualStatus);

	@Query(value = "select count(*) from source " + "where product_id = :product " + "and party = :party "
			+ "and  activity = :activity " + "and actual_status = :status;", nativeQuery = true)
	public Integer getActivityCount(@Param("product") Long productId, @Param("party") String partyName,
			@Param("activity") String activityName, @Param("status") Integer actualStatus);

}