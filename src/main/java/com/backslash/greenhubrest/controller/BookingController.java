package com.backslash.greenhubrest.controller;

import com.backslash.greenhubrest.models.Booking;
import com.backslash.greenhubrest.services.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity bookingChecker(@RequestBody Booking booking) {
        bookingService.searchBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
