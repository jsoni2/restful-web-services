/**
 * 
 */
package com.practice.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author janak.soni
 *
 */

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService userDaoService;
	
	// retrieveAllUsers
	
	@GetMapping("/users")
	public List<User> retrieveAllUser() {
		return userDaoService.findAll();
	}
	
	// retrieveUser(int id)
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return userDaoService.findOne(id);
	}
	
	//CREATED
	//input - details of user
	// output - CREATED & Return created URI
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User savedUser = userDaoService.save(user);
	}
	
}
