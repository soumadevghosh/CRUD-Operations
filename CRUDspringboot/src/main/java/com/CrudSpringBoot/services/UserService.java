package com.CrudSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringBoot.model.User;
import com.CrudSpringBoot.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	protected List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	protected Optional<User> getUserById(Integer Id) {
		return userRepository.findById(Id);
	}
	
	protected void addNewUser(User user) {
		userRepository.save(user);
	}
	
	protected void updateUser(User user) {
		userRepository.save(user);
	}
	
	protected void deleteUser(Integer Id) {
		userRepository.deleteById(Id);
	}
}
