package com.guggisberg.stefan.groupfitness.services;

import java.util.List;

import com.guggisberg.stefan.groupfitness.entities.User;
import com.guggisberg.stefan.groupfitness.exceptions.UserAlreadyExistsException;
import com.guggisberg.stefan.groupfitness.exceptions.UserNotFoundException;

public interface UserServiceRemote {

	public User create(User user)throws UserAlreadyExistsException;
	public User update(User user) throws UserNotFoundException;
	public void remove(Long id) throws UserNotFoundException;
	public User getUser(Long id) throws UserNotFoundException;
	public List<User> getAllUser();
	
}
