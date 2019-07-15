/**
 * 
 */
package com.microservice.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.account.jpa.AccountRepository;
import com.microservice.account.jpa.model.Account;

/**
 * @author amitmishra
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepoTest {

	@Autowired
	private AccountRepository repo;

	@Test
	public void testTranRepositoryLookupByAcctNum() {

		Account testTran = new Account("123-2223-212", "SGCurrent726", "Current", java.sql.Date.valueOf("2018-11-08"),
				"SGD", new BigDecimal("84327.51"), 1);

		List<Account> userAccount = repo.findAccountByUserId(1);

		assertThat(userAccount.get(0)).isEqualTo(testTran);

	}

}
