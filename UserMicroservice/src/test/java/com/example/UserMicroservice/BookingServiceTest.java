package com.example.UserMicroservice;

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
import com.example.UserMicroservice.Repositary.BookingDetailsRepositary;
import com.example.UserMicroservice.model.BookingDetails;
import com.example.UserMicroservice.service.BookingServices;



 
@ExtendWith(MockitoExtension.class)
 
// Main class
class BookingServiceTest {
 
    @Mock private BookingDetailsRepositary brep;
 
    private BookingServices bookingService;
    @BeforeEach
    void setUp()
    {
        this.bookingService
            = new BookingServices(this.brep);
    }
 
    @Test void getAllBooking()
    {
        bookingService.getAllBooking();
        verify(brep).findAll();//
        //here we are doing the checing in which sequence function should be called
        //first which should be called ===getAllBooking.. after that we are verifying
        //internally getAllFilter should have called findAll also
    }
    @Test
	public void getAllBookingTest()
	{
		List<BookingDetails> list = new ArrayList<BookingDetails>();
		BookingDetails bookingOne = new BookingDetails(1,35,"vara",875367,"7thaug",1,"seat is booked");
		BookingDetails bookingTwo=new BookingDetails(2,45,"varalakshmi",875387,"8thaug",2,"seat is booked");

		list.add(bookingOne);
		list.add(bookingTwo);
		

		when(bookingService.getAllBooking()).thenReturn(list);

		//test
		List<BookingDetails> bookingList = bookingService.getAllBooking();

		assertEquals(2, bookingList.size());
		verify(brep, times(1)).findAll();
		//We ware verifying that bookingrep is called only one times
	}

}