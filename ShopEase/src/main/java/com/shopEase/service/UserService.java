package com.shopEase.service;

import java.util.List;

import com.shopEase.exception.UserException;
import com.shopEase.model.User;

public interface UserService {

	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();


}
