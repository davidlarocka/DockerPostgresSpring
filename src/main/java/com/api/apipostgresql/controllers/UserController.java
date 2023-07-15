package com.api.apipostgresql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.apipostgresql.interfaces.UserInterface;
import com.api.apipostgresql.models.UserModel;

@RestController
@RequestMapping("/api/user")
public class UserController {

		@Autowired
		UserInterface userInterface;
		
	@GetMapping
	public List<UserModel> getAllUser() {
		
		return userInterface.findAll();
		
	}
	
	@GetMapping("/{id}")
	public UserModel getUserById(@PathVariable Long id) {
		return userInterface.findById(id).get();
	}
	
	@PostMapping("/new")
	public void createNew(@RequestBody UserModel user){
		userInterface.save(user);
		
	}
		
}
