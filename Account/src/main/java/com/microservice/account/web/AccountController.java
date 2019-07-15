package com.microservice.account.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.microservice.account.execption.AccountNotFoundException;
import com.microservice.account.model.AccountViewModel;
import com.microservice.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService acctService;

	@GetMapping("/{userId}")
	public List<AccountViewModel> getUserAccounts(@PathVariable(required = true) long userId) {

		try {
			return acctService.getUserAccounts(userId);
		} catch (AccountNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Accounts found for this user", ex);
		}
	}

}
