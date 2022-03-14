package com.blz.hotelreservation;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {

	@Test
	public void givenHotelNameCheckIfItIsCorrect() {
		Hotel hotels = new Hotel("LakeWood", 110);
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel(hotels);
		List<Hotel> hotelsList = hotelReservation.getHotelList();
		Assert.assertTrue(hotelsList.contains(hotels));
	}

////	@Test
//	public void givenHotelWeekDayPriceCheckIfItIsCorrect() {
//		HotelReservation hotelReservation = new HotelReservation();
//		Hotel hotel = hotelReservation.addHotel("LakeWood", 110);
//		Assert.assertEquals(110, hotel.getRateForRegularCustomerWeekDay(), 0.0);
//	}

}
