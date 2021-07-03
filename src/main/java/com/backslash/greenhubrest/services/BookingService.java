package com.backslash.greenhubrest.services;

import com.backslash.greenhubrest.dto.BookingList;
import com.backslash.greenhubrest.models.Booking;
import com.backslash.greenhubrest.models.Fleet;
import com.backslash.greenhubrest.repository.BookingRepository;
import com.backslash.greenhubrest.repository.FleetMonitorRepository;

import org.springframework.data.geo.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final FleetMonitorRepository fleetMonitorRepository;

    public BookingService(BookingRepository bookingRepository, FleetMonitorRepository fleetMonitorRepository) {
        this.bookingRepository = bookingRepository;
        this.fleetMonitorRepository = fleetMonitorRepository;
    }

    public void searchBooking(Booking booking) {


        GeoResults<Fleet> fleetData = fleetMonitorRepository.findByLocationNear(
        		new Point(booking.getPickLat(), booking.getPickLon()), 
        		new Distance(2, Metrics.KILOMETERS));
        
        List<GeoResult<Fleet>> data   = fleetData.getContent();
        int size = data.size();
        
        List<BookingList> bookingList = new ArrayList<BookingList>();
        
        for(int i = 0; i < size; i ++) {
        	 GeoResult<Fleet>  geo = data.get(i);
        	 
        	 BookingList bookingList2 = new BookingList();
        	 
        	 Fleet fleet = geo.getContent();
        	 Distance distance = geo.getDistance();
        	
        	bookingList2.setFleet(fleet);
        	bookingList2.setDistance(distance);
        	
        	bookingList.add(bookingList2);
        	 
        }
        
        for(int j = 0 ; j < bookingList.size(); j ++) {
        	
        	BookingList bookingLists  = bookingList.get(j);
        	
        	// check here
        	
        	
        	System.out.println(bookingLists);
        	
        }
                
        // this is how access the object variable 
          
         BookingList list = bookingList.get(0); 
         
         Distance distance = list.getDistance();
         
         System.out.println("list " +distance );
        
        


    }



    }
