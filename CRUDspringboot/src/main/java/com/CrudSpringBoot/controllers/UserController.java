package com.CrudSpringBoot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CrudSpringBoot.model.User;
import com.CrudSpringBoot.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userHome",method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> saveUsers(@RequestBody User user) {
		userService.addNewUser(user);
		return new ResponseEntity<String>("Success",HttpStatus.OK);		
	}
	
	@RequestMapping(value="getUserById",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public ResponseEntity<User> getUserById(@RequestBody Integer Id) {
		User user = userService.getUserById(Id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
}
