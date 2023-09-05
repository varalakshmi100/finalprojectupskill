package com.example.UserMicroservice.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserMicroservice.model.BookingDetails;





public interface BookingDetailsRepositary extends JpaRepository<BookingDetails,Integer> {

}
