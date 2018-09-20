/**
 * 
 */
package com.practice.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author janak.soni
 *
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * @param message
	 */
	protected UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
