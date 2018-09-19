/**
 * 
 */
package com.practice.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janak.soni
 *
 */

// Controller

@RestController
public class HelloWorldController {
	
	// GET
	// URI /hello-world
	// method - "Hello Janak"
	
//	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
//	public String helloWorld() {
//		return "Hello Janak";
//	}
	
//	@GetMapping(path="/hello-world")
//	public String helloWorld() {
//		return "Hello Janak";
//	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Janak");
	}
	
}
