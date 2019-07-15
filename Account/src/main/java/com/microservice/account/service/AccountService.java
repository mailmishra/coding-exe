/**
 * 
 */
package com.microservice.account.service;

import java.util.List;

import com.microservice.account.execption.AccountNotFoundException;
import com.microservice.account.model.AccountViewModel;

/**
 * @author amitmishra
 *
 */
public interface AccountService {
	
	List<AccountViewModel> getUserAccounts(long userId) throws AccountNotFoundException;

}
