package com.microservice.transaction;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.sql.Date;
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

import com.microservice.transaction.jpa.TransactionRepository;
import com.microservice.transaction.jpa.model.Transaction;
import com.microservice.transaction.model.TransactionViewModel;
import com.microservice.transaction.service.TransactionService;
import com.microservice.transaction.service.TransactionServiceImpl;

@RunWith(SpringRunner.class)
public class TransactionApplicationTests {

	@TestConfiguration
	static class TransactionServiceConfiguration {

		@Bean
		public TransactionService getTranService() {
			return new TransactionServiceImpl();
		}
	}

	@Autowired
	private TransactionService tranService;

	@MockBean
	private TransactionRepository tranRepo;

	@MockBean
	private DateFormat viewDateFrormat;

	@Before
	public void setUp() {
		Transaction testTran = new Transaction("123-2223-212", "Current Account", java.sql.Date.valueOf("2012-01-12"),
				"SGD", new BigDecimal("9540.98"), "");
		testTran.setId(1);

		List<Transaction> userTran = new ArrayList<Transaction>();
		userTran.add(testTran);

		String str = "JAN. 12, 2012";
		Date d = Date.valueOf("2012-01-12");

		ReflectionTestUtils.setField(tranService, "viewDateFrormat", new SimpleDateFormat("MMM. DD, YYYY"));
		Mockito.when(tranRepo.findTransactionByAcctNum("123-2223-212")).thenReturn(userTran);
		// Mockito.when(viewDateFrormat.format(d)).thenReturn(str);
	}

	@Test
	public void testFindTransactionByAcctNm() throws Exception {

		TransactionViewModel tvm = new TransactionViewModel("123-2223-212", "Current Account", "Jan. 12, 2012", "SGD",
				new BigDecimal("0"), new BigDecimal("9540.98"), "Credit", "");

		List<TransactionViewModel> tvmList = tranService.getTransactionDetailsByAccount("123-2223-212");

		assertThat(tvmList.get(0)).isEqualTo(tvm);
	}

}
