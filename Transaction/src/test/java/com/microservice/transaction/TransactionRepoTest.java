/**
 * 
 */
package com.microservice.transaction;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.transaction.common.AppProperties;
import com.microservice.transaction.jpa.TransactionRepository;
import com.microservice.transaction.jpa.model.Transaction;

/**
 * @author amitmishra
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class TransactionRepoTest {



	@Autowired
	private TransactionRepository repo;



	@Test
	public void testTranRepositoryLookupByAcctNum() {
		
		 Transaction testTran = new Transaction("123-2223-212","Current Account", 
				 java.sql.Date.valueOf("2012-01-12"), "SGD" , new BigDecimal("9540.98"), "");
		 testTran.setId(1);

		 List<Transaction> userTran = repo.findTransactionByAcctNum("123-2223-212");
		 
		 assertThat(userTran.get(0)).isEqualTo(testTran);
		 
		
	}

}
