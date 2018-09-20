/**
 * 
 */
package com.practice.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janak.soni
 *
 */

@RestController
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello Get Mapping";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello Bean");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBeanPath(@PathVariable String name) {
		return new HelloWorldBean("Hello "+name);
	}
}
