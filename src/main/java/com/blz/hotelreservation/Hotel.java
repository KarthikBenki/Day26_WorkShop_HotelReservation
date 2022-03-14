package com.blz.hotelreservation;

public class Hotel {
	private String hotelName;
	private double rateForRegularCustomerWeekDay;
	private double rateForRegularCustomerWeekEnd;
	
	/*
	 * default constructor
	 */
	public Hotel() {
		
	}

	public Hotel(String hotelName, double rateForRegularCustomerWeekDay, double rateForRegularCustomerWeekEnd) {
		super();
		this.hotelName = hotelName;
		this.rateForRegularCustomerWeekDay = rateForRegularCustomerWeekDay;
		this.rateForRegularCustomerWeekEnd = rateForRegularCustomerWeekEnd;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRateForRegularCustomerWeekDay() {
		return rateForRegularCustomerWeekDay;
	}

	public void setRateForRegularCustomerWeekDay(double rateForRegularCustomerWeekDay) {
		this.rateForRegularCustomerWeekDay = rateForRegularCustomerWeekDay;
	}

	public double getRateForRegularCustomerWeekEnd() {
		return rateForRegularCustomerWeekEnd;
	}

	public void setRateForRegularCustomerWeekEnd(double rateForRegularCustomerWeekEnd) {
		this.rateForRegularCustomerWeekEnd = rateForRegularCustomerWeekEnd;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rateForRegularCustomerWeekDay=" + rateForRegularCustomerWeekDay
				+ ", rateForRegularCustomerWeekEnd=" + rateForRegularCustomerWeekEnd + "]";
	}
	
	
}
