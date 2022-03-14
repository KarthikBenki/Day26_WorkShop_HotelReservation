package com.blz.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotelList = new ArrayList<>();

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	/*
	 * @purpose: Ability to add hotel
	 * 
	 * @function: adds values using setters method
	 */
	public Hotel addHotel(Hotel hotel) {
		hotelList.add(hotel);
		return hotel;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

	}

}
