package com.devs_on_deck.moneem.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devs_on_deck.moneem.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	
	//  find user by email
	Optional<User> findByEmail(String email);
	
	// get all developers
	List<User> findAll();
}
