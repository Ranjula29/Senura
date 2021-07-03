package com.backslash.greenhubrest.dto;

import org.springframework.data.geo.Distance;

import com.backslash.greenhubrest.models.Fleet;

public class BookingList {
	
	private Fleet fleet;
	private Distance distance;
	
	
	
	public BookingList() {
			}



	public Fleet getFleet() {
		return fleet;
	}



	public void setFleet(Fleet fleet) {
		this.fleet = fleet;
	}



	public Distance getDistance() {
		return distance;
	}



	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	
}
