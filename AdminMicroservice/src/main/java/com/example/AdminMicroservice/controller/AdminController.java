package com.example.AdminMicroservice.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.AdminMicroservice.model.AdminRegister;
import com.example.AdminMicroservice.repository.AdminRepository;
	
@RestController    //a Spring annotation that is used to build REST API in a declarative way
	@CrossOrigin()     //a security concept that allows restricting the resources implemented in web browsers.
public class AdminController {
		@Autowired   //used for automatic dependency injection. 
		AdminRepository adminresp;
		
		@PostMapping("/admin/register")  //Annotation for mapping HTTP POST requests onto specific handler methods.
		public AdminRegister saveUser(@RequestBody AdminRegister m1)
		{
			return adminresp.save(m1);
			
		}
		@GetMapping("/admin/login")     //Annotation for mapping HTTP GET requests onto specific handler methods.
		public String getLogin() {
		return "success";
		}
		@GetMapping ("/admin/logout/{username}")
		public String logout (@PathVariable String username)
		{
		return username+"Log out";
	}
		
		
		
		
		@PostMapping("/admin/adduser")
		public AdminRegister save(@RequestBody AdminRegister m1)
		{
			return adminresp.save(m1);
			}
		@GetMapping("/admin/deleteuser/{username}")
		public String deleteuser(@PathVariable String username)
		{
			adminresp.deleteById(username);
			return "deleted";
			}
		@GetMapping("/admin/searchuser/{username}")
		public AdminRegister searchuser(@PathVariable String username)
		{
			return adminresp.findById(username).get();
			}
		@PutMapping("/admin/updateuser/{username}") //used for mapping HTTP PUT requests onto specific handler methods.
		public AdminRegister updateuser(@PathVariable String username,@RequestBody AdminRegister r1)
		{
			AdminRegister r2=adminresp.findById(username).get();
			r2.setUsername(r1.getUsername());
			r2.setPassword(r1.getPassword());
			return adminresp.save(r2);
			}
		@GetMapping("/admin/view")
		public List<AdminRegister> viewusers()
		{
			return adminresp.findAll();
			}
		
		
	}


