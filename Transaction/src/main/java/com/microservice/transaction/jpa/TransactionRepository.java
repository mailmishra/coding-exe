/**
 * 
 */
package com.microservice.transaction.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.transaction.jpa.model.Transaction;

/**
 * @author amitmishra
 *
 */	

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	List<Transaction> findTransactionByAcctNum(String acctNum);

}
