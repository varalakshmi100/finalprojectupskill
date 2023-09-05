package com.example.UserMicroservice.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserMicroservice.model.UserRegister;





@Repository
public interface UserRepository extends JpaRepository<UserRegister,String> {
	public UserRegister findByUsername(String name);

	

}
