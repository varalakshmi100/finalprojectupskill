package com.example.UserMicroservice.controller;


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

	import com.example.UserMicroservice.Repositary.BookingDetailsRepositary;
	import com.example.UserMicroservice.model.BookingDetails;
	@RestController

	@CrossOrigin()

	@RequestMapping("/user")


	public class BookingDetailsController {
		

		

		@Autowired

		BookingDetailsRepositary brep;

		@PostMapping("/ins")
		public BookingDetails getsave(@RequestBody BookingDetails b)

		{

		return brep.save(b);
		}
		@DeleteMapping("/del/{bookingid}")

		public String deleteBooking(@PathVariable int bookingid)
		{

		brep.deleteById(bookingid);
		return "deleted";
		}
		/*@GetMapping("/srch/{bookingid}")
		public BookingDetails searchBooking(@PathVariable("bookingid") int bookingid)
		{
		return brep.findById(bookingid).get();
		 }*/
		@PutMapping("/updat/{bookingid}")
		public BookingDetails updateBooking(@PathVariable ("bookingid")int bookingid,@RequestBody BookingDetails b1)
		{

		BookingDetails b2=brep.findById(bookingid).get();

		b2.setSeatno(b1.getSeatno());
		
		
		b2.setPassengername(b1.getPassengername());
		b2.setMobileno(b1.getMobileno());
		b2.setDate(b1.getDate());
		b2.setNoofpassengers(b1.getNoofpassengers());
		


		return brep.save(b2);
		}
		/*@PostMapping("/booking")
		public String save(@RequestBody BookingDetails bookingDetails)
		{
			brep.save(bookingDetails);
			return "your booking has been done successfully";
		}*/

		@GetMapping("/retr")
		public List<BookingDetails> retreiveBooking()
		{

		return brep.findAll();
		}

		}



