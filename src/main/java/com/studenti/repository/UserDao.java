package com.studenti.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studenti.model.Users;

@Repository
public interface  UserDao  extends CrudRepository<Users, Long>  {

	
	Users findByUsername(String username);
	
	
	
}
