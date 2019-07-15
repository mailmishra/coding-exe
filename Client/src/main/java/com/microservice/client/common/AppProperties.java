/**
 * 
 */
package com.microservice.client.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author amitmishra
 *
 */
@Configuration
@PropertySource("classpath:client-service.properties")
public class AppProperties {

	@Value("${transaction.service.uri}")
	private String transactionServiceUri;

	@Value("${account.service.uri}")
	private String accountServiceUri;

	/**
	 * @return the transactionServiceUri
	 */
	public String getTransactionServiceUri() {
		return transactionServiceUri;
	}

	/**
	 * @param transactionServiceUri the transactionServiceUri to set
	 */
	public void setTransactionServiceUri(String transactionServiceUri) {
		this.transactionServiceUri = transactionServiceUri;
	}

	/**
	 * @return the accountServiceUri
	 */
	public String getAccountServiceUri() {
		return accountServiceUri;
	}

	/**
	 * @param accountServiceUri the accountServiceUri to set
	 */
	public void setAccountServiceUri(String accountServiceUri) {
		this.accountServiceUri = accountServiceUri;
	}

}
