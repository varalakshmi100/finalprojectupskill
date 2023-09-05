package com.example.AdminMicroservice.repository;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdminMicroservice.model.FlightDetails;



public interface FlightDetailsRepository extends JpaRepository<FlightDetails,Integer>{
	
}