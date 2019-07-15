/**
 * 
 */
package com.microservice.account.service;

import java.text.DateFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.account.execption.AccountNotFoundException;
import com.microservice.account.jpa.AccountRepository;
import com.microservice.account.jpa.model.Account;
import com.microservice.account.model.AccountViewModel;

/**
 * @author amitmishra Transaction service
 */

@Service

public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository acctRepo;

	@Autowired
	DateFormat viewDateFrormat;

	public AccountServiceImpl() {

	}

	public List<AccountViewModel> getUserAccounts(long userId) throws AccountNotFoundException {

		List<Account> accounts = acctRepo.findAccountByUserId(userId);
		if (accounts.size() <= 0)
			throw new AccountNotFoundException("No accounts found for the given User");
		return accounts.stream().map(this::mapAccountToViewModel).collect(Collectors.toList());

	}

	public AccountViewModel mapAccountToViewModel(Account t) {

		return AccountViewModel.builder().withAccountNumber(t.getAcctNum()).withAccountName(t.getAcctName())
				.withCurrency(t.getCurrency()).withBalanceDate(this.viewDateFrormat.format(t.getBalanceDate()))
				.withAccountType(t.getAcctType()).withBalance(t.getBalance()).build();
	}

}
