package com.hcl.inghackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	Transaction findByPartyIdAndApprovalStatus(Long partyId, String approvalStatus);
	
	@Query(value = "select *  from transaction where party_id=?1 and approval_status !='approved'", nativeQuery = true)
	public List<Transaction> getOfUnapprovedTransactions(Long l);

}