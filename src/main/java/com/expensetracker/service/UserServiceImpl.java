package com.expensetracker.service;

import java.util.List;

import com.expensetracker.exceptions.UserNotFoundException;
import com.expensetracker.model.User;
import com.expensetracker.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService {
	UserRepositoryImpl userRepository = new UserRepositoryImpl();

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		userRepository.registerUser(user);
	}

	@Override
	public void loginUser(User user) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(String name, String email) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User geUserById(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
