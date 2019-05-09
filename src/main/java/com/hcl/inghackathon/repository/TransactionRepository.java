package com.hcl.inghackathon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.inghackathon.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	@Query(value = "select transaction_id, party_id, amount_to_be_paid, approval_status  from transaction "
			+ "where approval_status not in ('approved')" + "and party_id = :partyId", nativeQuery = true)
	public List<Transaction> getOfUnapprovedTransactions(@Param("partyId") Long party_id);

}