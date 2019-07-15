package com.microservice.transaction.service;

import java.util.List;

import com.microservice.transaction.execption.TransactionNotFoundException;
import com.microservice.transaction.model.TransactionViewModel;

public interface TransactionService {

	List<TransactionViewModel> getTransactionDetailsByAccount(String acctNumber) throws TransactionNotFoundException;
}
