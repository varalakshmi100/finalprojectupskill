package com.example.AdminMicroservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.AdminMicroservice.model.FlightDetails;
import com.example.AdminMicroservice.repository.FlightDetailsRepository;
import com.example.AdminMicroservice.service.FlightDetailsservice;
@ExtendWith(MockitoExtension.class)
 
// Main class
class FlightDetailsserviceTest {
 
    @Mock private FlightDetailsRepository frep;
 
    private FlightDetailsservice flightDetailsservice;
    @BeforeEach
    void setUp()
    {
    	 this.flightDetailsservice
         = new FlightDetailsservice(this.frep);
    }
 
    @Test void getAllFlight()
    {
        flightDetailsservice.getAllFlight();
        verify(frep).findAll();//
        //here we are doing the checing in which sequence function should be called
        //first which should be called ===getAllFlight.. after that we are verifying
        //internally getAllFilter should have called findAll also
    }
    @Test
	public void getAllFlightTest()
	{
		List<FlightDetails> list = new ArrayList<FlightDetails>();
		FlightDetails flightOne = new FlightDetails(101,"Mumbai","Channi","12:00:00","01:00:00",1200,2,"Business");
		FlightDetails flightTwo=new FlightDetails(102,"Chennai","Mysore","02:00:00","03:00:00",1500,3,"Economic");

		list.add(flightOne);
		list.add(flightTwo);
		

		when(flightDetailsservice.getAllFlight()).thenReturn(list);

		//test
		List<FlightDetails> flightList = flightDetailsservice.getAllFlight();

		assertEquals(2, flightList.size());
		verify(frep, times(1)).findAll();
		//We ware verifying that bookingrep is called only one times
	}

}