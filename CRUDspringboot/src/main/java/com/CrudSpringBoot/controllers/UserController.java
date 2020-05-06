package com.CrudSpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CrudSpringBoot.services.UserService;

@Controller
@RequestMapping("/Customer")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/getUsers")
	public Object getUsers(Model model) {
		return model;
		
	}
}
