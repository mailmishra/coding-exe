package com.microservice.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.microservice.account.jpa.AccountRepository;
import com.microservice.account.jpa.model.Account;
import com.microservice.account.model.AccountViewModel;
import com.microservice.account.service.AccountService;
import com.microservice.account.service.AccountServiceImpl;

@RunWith(SpringRunner.class)
public class AccountApplicationTests {

	@TestConfiguration
	static class AccountServiceConfiguration {

		@Bean
		public AccountService getAcctService() {
			return new AccountServiceImpl();
		}
	}

	@Autowired
	private AccountService acctService;

	@MockBean
	private AccountRepository acctRepo;

	@MockBean
	private DateFormat viewDateFrormat;

	@Before
	public void setUp() {
		Account testAcct = new Account("123-2223-212", "SGCurrent726", "Current", java.sql.Date.valueOf("2018-11-08"),
				"SGD", new BigDecimal("84327.51"), 1);

		List<Account> userAcct = new ArrayList<Account>();
		userAcct.add(testAcct);

		ReflectionTestUtils.setField(acctService, "viewDateFrormat", new SimpleDateFormat("MM/DD/yyyy"));
		Mockito.when(acctRepo.findAccountByUserId(1)).thenReturn(userAcct);
	}

	@Test
	public void testFindAccountByAcctNm() throws Exception {

		AccountViewModel avm = new AccountViewModel("123-2223-212", "SGCurrent726", "Current", "2018/08/11", "SGD",
				new BigDecimal("84327.51"));

		List<AccountViewModel> avmList = acctService.getUserAccounts(1);

		assertThat(avmList.get(0)).isEqualTo(avm);
	}

}
