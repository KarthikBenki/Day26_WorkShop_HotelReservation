package com.blz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelNameCheckIfItIsCorrect() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel = hotelReservation.addHotel("LakeWood", 110, 90);
		Assert.assertEquals("LakeWood", hotel.getHotelName());
	}

	@Test
	public void givenHotelWeekDayPriceCheckIfItIsCorrect() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel = hotelReservation.addHotel("LakeWood", 110, 90);
		Assert.assertEquals(110, hotel.getRateForRegularCustomerWeekDay(), 0.0);
	}

	@Test
	public void givenHotelWeekEndPriceCheckIfItIsCorrect() {
		HotelReservation hotelReservation = new HotelReservation();
		Hotel hotel = hotelReservation.addHotel("LakeWood", 110, 90);
		Assert.assertEquals(90, hotel.getRateForRegularCustomerWeekEnd(), 0.0);
	}

}
