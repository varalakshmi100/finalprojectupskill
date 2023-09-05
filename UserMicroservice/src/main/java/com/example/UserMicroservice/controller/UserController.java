package com.example.UserMicroservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserMicroservice.Repositary.UserRepository;
import com.example.UserMicroservice.model.UserRegister;


	
@RestController    //a Spring annotation that is used to build REST API in a declarative way
	@CrossOrigin()     //a security concept that allows restricting the resources implemented in web browsers.
public class UserController {
		@Autowired   //used for automatic dependency injection. 
		UserRepository userresp;
		
		@PostMapping("/user/register")  //Annotation for mapping HTTP POST requests onto specific handler methods.
		public UserRegister saveUser(@RequestBody UserRegister m1)
		{
			return userresp.save(m1);
			
		}
		@GetMapping("/user/login")     //Annotation for mapping HTTP GET requests onto specific handler methods.
		public String getLogin() {
		return "success";
		}
		@GetMapping ("/user/logout/{username}")
		public String logout (@PathVariable String username)
		{
		return username+"Log out";
	}
		
		
		
		
		@PostMapping("/user/adduser")
		public UserRegister save(@RequestBody UserRegister m1)
		{
			return userresp.save(m1);
			}
		@GetMapping("/user/deleteuser/{username}")
		public String deleteuser(@PathVariable String username)
		{
			userresp.deleteById(username);
			return "deleted";
			}
		@GetMapping("/user/searchuser/{username}")
		public UserRegister searchuser(@PathVariable String username)
		{
			return userresp.findById(username).get();
			}
		@PutMapping("/user/updateuser/{username}") //used for mapping HTTP PUT requests onto specific handler methods.
		public UserRegister updateuser(@PathVariable String username,@RequestBody UserRegister r1)
		{
			UserRegister r2=userresp.findById(username).get();
			r2.setUsername(r1.getUsername());
			r2.setPassword(r1.getPassword());
			return userresp.save(r2);
			}
		@GetMapping("/user/view")
		public List<UserRegister> viewusers()
		{
			return userresp.findAll();
			}
		
		
	}
