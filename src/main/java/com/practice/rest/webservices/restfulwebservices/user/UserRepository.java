/**
 * 
 */
package com.practice.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author janak.soni
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

}
