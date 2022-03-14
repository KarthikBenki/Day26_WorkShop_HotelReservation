package com.blz.hotelreservation;

public class HotelReservation {
	
public Hotel addHotel(String hName,double weekDayRate,double weekEndRate ) {
		Hotel hotel = new Hotel();
		hotel.setHotelName(hName);
		hotel.setRateForRegularCustomerWeekDay(weekDayRate);
		hotel.setRateForRegularCustomerWeekEnd(weekEndRate);
		return hotel;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");

	}
		
}
