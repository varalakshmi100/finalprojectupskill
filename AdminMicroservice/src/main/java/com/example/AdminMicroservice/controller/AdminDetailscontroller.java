package com.example.AdminMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AdminMicroservice.model.FlightDetails;
import com.example.AdminMicroservice.repository.FlightDetailsRepository;



public class AdminDetailscontroller {
	@RestController

	@CrossOrigin()

	@RequestMapping("/admin")

	public class AdminController {

	@Autowired

	FlightDetailsRepository frep;

	@PostMapping("/insert")
	public FlightDetails getsave(@RequestBody FlightDetails f)

	{

	return frep.save(f);
	}
	@DeleteMapping("/delete/{flightid}")

	public String deleteFlight(@PathVariable int flightid)
	{

	frep.deleteById(flightid);
	return "deleted";
	}
	/*@GetMapping("/search/{flightid}")
	public FlightDetails searchFacilities(@PathVariable("flightid") int flightid)
	{
	return frep.findById(flightid).get();
	 }*/
	@PutMapping("/update/{flightid}")
	public FlightDetails updateFlight(@PathVariable ("flightid")int flightid,@RequestBody FlightDetails f1)
	{

	FlightDetails f2=frep.findById(flightid).get();

	f2.setSource(f1.getSource());
	f2.setDestination(f1.getDestination());

	f2.setArrivaltime(f1.getArrivaltime());
	f2.setDeparturetime(f1.getDeparturetime());
   f2.setNoofstops(f1.getNoofstops());
   f2.setFlighttype(f1.getFlighttype());
   f2.setPrice(f1.getPrice());

	


	return frep.save(f2);
	}

	@GetMapping("/retreive")
	public List<FlightDetails> retreiveFlight()
	{

	return frep.findAll();
	}

	}

}
