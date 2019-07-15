/**
 * 
 */
package com.microservice.client.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author amitmishra
 *
 */

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Resource Not Found")
public class ResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
