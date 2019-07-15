/**
 * 
 */
package com.microservice.transaction.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author amitmishra
 *
 */

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Account Not Found")
public class TransactionNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

    public TransactionNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
