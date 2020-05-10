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
	
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	public User getUserById(Integer Id) {
		return userRepository.findById(Id).get();
	}
	
	public void addNewUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(Integer Id) {
		userRepository.deleteById(Id);
	}
}
