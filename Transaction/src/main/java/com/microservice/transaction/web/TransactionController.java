package com.microservice.transaction.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.microservice.transaction.execption.TransactionNotFoundException;
import com.microservice.transaction.model.TransactionViewModel;
import com.microservice.transaction.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService tranService;

	@GetMapping("/{acctNum}")
	public List<TransactionViewModel> getTransactionByAccountNumber(@PathVariable(required = true) String acctNum) {

		try {
			return tranService.getTransactionDetailsByAccount(acctNum);
		} catch (TransactionNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No transactions found for this account", ex);
		}
	}

}
