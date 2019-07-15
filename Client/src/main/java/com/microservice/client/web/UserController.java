/**
 * 
 */
package com.microservice.client.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.microservice.client.exception.ResourceNotFoundException;
import com.microservice.client.exception.UserRequestProcessingException;
import com.microservice.client.model.AccountViewModel;
import com.microservice.client.model.TransactionViewModel;
import com.microservice.client.service.RestService;

/**
 * @author amitmishra
 *
 */
@RestController
public class UserController {

	@Autowired
	private RestService restService;

	@GetMapping("/accounts/{userId}")
	public List<AccountViewModel> getUserAccounts(@PathVariable(required = true) long userId) {
		try {
			return restService.getAccountsForUser(userId);
		} catch (ResourceNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Accounts found for the said user", e);
		}catch(UserRequestProcessingException e1) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching User account details", e1);
		}
		
	}

	@GetMapping("/transactions/{accountId}")
	public List<TransactionViewModel> getAccountTransaction(@PathVariable(required = true) String accountId) {
		try {
			return restService.getTransactionForAccoount(accountId);
		} catch (ResourceNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No transactions found for the said account", e);
		} catch(Exception e1) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error fetching account transaction details", e1);
		}
	}

}
