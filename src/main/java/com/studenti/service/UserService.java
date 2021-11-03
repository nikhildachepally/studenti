package com.studenti.service;

import java.util.List;

import com.studenti.model.UserDto;
import com.studenti.model.Users;


public interface UserService {
	Users save(UserDto user);
    List<Users> findAll();
    Users findOne(String username);
}
