package com.example.UserMicroservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //@Entity annotation specifies that the class is an entity and is mapped to a database table.
@Table(name="BookingDetailsmini1") //The @Table annotation specifies the name of the database table to be used for mapping. 
public class BookingDetails {
	@Id  //@Id annotation specifies the primary key of an entity
	private int bookingid;
	//enables you to customize the mapping between the entity attribute and the database column
	
	private int seatno;
	public BookingDetails(int i,int k, String string, int l, String string2, int m, String string3) {
		// TODO Auto-generated constructor stub
	}
	public BookingDetails()
	{
		
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public int getNoofpassengers() {
		return noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	public String getBookingconformation() {
		return bookingconformation;
	}
	public void setBookingconformation(String bookingconformation) {
		this.bookingconformation = bookingconformation;
	}


	private String passengername;
	
	private long mobileno;
	
	private String date;
	
	private int noofpassengers;
	private String bookingconformation;
	
	

}