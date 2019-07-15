/**
 * 
 */
package com.microservice.transaction.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.microservice.transaction.execption.TransactionNotFoundException;
import com.microservice.transaction.jpa.TransactionRepository;
import com.microservice.transaction.jpa.model.Transaction;
import com.microservice.transaction.model.TransactionTypeEnum;
import com.microservice.transaction.model.TransactionViewModel;

/**
 * @author amitmishra Transaction service
 */

@Service

public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepository tranRepo;

	@Autowired
	DateFormat viewDateFrormat;
	
	public TransactionServiceImpl()  {
		
	}

	@Override
	public List<TransactionViewModel> getTransactionDetailsByAccount(String acctNumber) throws TransactionNotFoundException{

		List<Transaction> transactions = tranRepo.findTransactionByAcctNum(acctNumber);
		if(transactions.size() <= 0 )
			throw new TransactionNotFoundException("No transactions found for the given account");
		return transactions.stream().map(this::mapTransactionToViewModel).collect(Collectors.toList());

	}
	
	public  TransactionViewModel mapTransactionToViewModel(Transaction t) {
		Boolean credit = t.getAmount().doubleValue() >= 0 ? true : false;
		return TransactionViewModel.builder().withAccountNumber(t.getAcctNum()).withAccountName(t.getAcctName())
				.withCurrency(t.getCurrency()).withNarrative(t.getNarrative())
				.withValueDate(this.viewDateFrormat.format(t.getValueDate()))
				.withTransactionType(
						credit ? TransactionTypeEnum.Credit.toString() : TransactionTypeEnum.Debit.toString())
				.withDebitAmount(credit ? new BigDecimal(0) : t.getAmount())
				.withCreditAmount(credit ? t.getAmount() : new BigDecimal(0)).build();
	
	}

}
