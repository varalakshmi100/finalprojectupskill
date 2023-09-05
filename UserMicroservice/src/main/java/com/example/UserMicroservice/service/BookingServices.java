package com.example.UserMicroservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserMicroservice.Repositary.BookingDetailsRepositary;
import com.example.UserMicroservice.model.BookingDetails;





@Service
public class BookingServices {
	
	
	 
	 
	    @Autowired
	    
	    private BookingDetailsRepositary brep;
	 
	    public List<BookingDetails> getAllBooking()
	    {
	       return this.brep.findAll();
	    	//return null;
	    }
	 
	    public BookingServices(BookingDetailsRepositary brep)
	    {
	        // this keyword refers to current instance
	        this.brep = brep;
	    }
	}