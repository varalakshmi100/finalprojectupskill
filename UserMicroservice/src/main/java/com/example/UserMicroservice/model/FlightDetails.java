package com.example.UserMicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //@Entity annotation specifies that the class is an entity and is mapped to a database table.
@Table(name="FlightDetailsmini1") //The @Table annotation specifies the name of the database table to be used for mapping. 
public class FlightDetails {
	public FlightDetails(int i, String string, String string2, String string3, String string4,
			int j, int k, String string5) {
		
	}
	public FlightDetails()
	{
		
	}
	@Id //@Id annotation specifies the primary key of an entity
    private int flightid;
	

	 //enables you to customize the mapping between the entity attribute and the database column
    private String source;
	
	private String destination;
	
	private String departuretime;
	
	private String arrivaltime;
	
	private Double price;
	
	private int noofstops;
	
	private String flighttype;

	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNoofstops() {
		return noofstops;
	}
	public void setNoofstops(int noofstops) {
		this.noofstops = noofstops;
	}
	public String getFlighttype() {
		return flighttype;
	}
	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}
}

