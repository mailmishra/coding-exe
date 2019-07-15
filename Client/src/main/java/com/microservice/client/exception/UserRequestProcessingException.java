/**
 * 
 */
package com.microservice.client.exception;

/**
 * @author amitmishra
 *
 */
public class UserRequestProcessingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserRequestProcessingException(String message, Throwable ex) {
		super(message, ex);
	}

	public UserRequestProcessingException(String message) {
		super(message);
	}

}
