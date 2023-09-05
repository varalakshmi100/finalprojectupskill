package com.example.AdminMicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdminMicroservice.model.FlightDetails;
import com.example.AdminMicroservice.repository.FlightDetailsRepository;



@Service
public class FlightDetailsservice{


	 
	 
	    @Autowired
	    
	    private FlightDetailsRepository frep;
	 
	  public List<FlightDetails> getAllFlight()
	    {
	       return this.frep.findAll();
	    	//return null;
	    }
	 
	    public FlightDetailsservice(FlightDetailsRepository frep)
	    {
	      //this keyword refers to current instance
	        this.frep = frep;
	    }
	}
