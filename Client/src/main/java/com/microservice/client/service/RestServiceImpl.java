/**
 * 
 */
package com.microservice.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.client.common.AppProperties;
import com.microservice.client.exception.ResourceNotFoundException;
import com.microservice.client.exception.UserRequestProcessingException;
import com.microservice.client.model.AccountViewModel;
import com.microservice.client.model.TransactionViewModel;

/**
 * @author amitmishra
 *
 */
@Service
public class RestServiceImpl implements RestService {

	@Autowired
	private AppProperties props;

	@Override
	public List<AccountViewModel> getAccountsForUser(long userId) throws ResourceNotFoundException, UserRequestProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<AccountViewModel>> response = restTemplate.exchange(props.getAccountServiceUri() + userId,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<AccountViewModel>>() {
				});
		if (response.getStatusCode() == HttpStatus.OK)
			return response.getBody();
		else if (response.getStatusCode() == HttpStatus.NOT_FOUND)
			throw new ResourceNotFoundException("No accounts found for the user.");
		else
			throw new UserRequestProcessingException(
					"Exception occurred while fetching account details, status code is: " + response.getStatusCode());
	}

	@Override
	public List<TransactionViewModel> getTransactionForAccoount(String acctId) throws ResourceNotFoundException, UserRequestProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<TransactionViewModel>> response = restTemplate.exchange(
				props.getTransactionServiceUri() + acctId, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<TransactionViewModel>>() {
				});
		if (response.getStatusCode() == HttpStatus.OK)
			return response.getBody();
		else if (response.getStatusCode() == HttpStatus.NOT_FOUND)
			throw new ResourceNotFoundException("No accounts found for the user.");
		else
			throw new UserRequestProcessingException(
					"Exception occurred while fetching account details, status code is: " + response.getStatusCode());
	}

}
