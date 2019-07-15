/**
 * 
 */
package com.microservice.client.service;

import java.util.List;

import com.microservice.client.exception.ResourceNotFoundException;
import com.microservice.client.model.AccountViewModel;
import com.microservice.client.model.TransactionViewModel;

/**
 * @author amitmishra
 *
 */
public interface RestService {
	
	List<AccountViewModel> getAccountsForUser(long userId) throws ResourceNotFoundException;
	
	List<TransactionViewModel> getTransactionForAccoount(String acctId)  throws ResourceNotFoundException;

}
