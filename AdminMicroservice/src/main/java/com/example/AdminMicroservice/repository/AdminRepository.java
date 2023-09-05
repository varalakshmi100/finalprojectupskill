package com.example.AdminMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AdminMicroservice.model.AdminRegister;



@Repository
public interface AdminRepository extends JpaRepository<AdminRegister,String> {
	public AdminRegister findByUsername(String name);

	

}
