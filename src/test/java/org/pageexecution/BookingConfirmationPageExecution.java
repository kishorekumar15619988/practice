package org.pageexecution;

import org.baseclass.BaseClass;
import org.locators.BookingConfirmationLocators;

public class BookingConfirmationPageExecution extends BookAHotelPageExecution{
	
	public static void searchHotel() {
		BaseClass.clickonElement(findElementById(BookingConfirmationLocators.searchhotel), 10);
		
		
	}
	
	public static void myitenery() {
		BaseClass.clickonElement(findElementById(BookingConfirmationLocators.itenery), 10);
		
	}
	
	public static void logout() {
		BaseClass.clickonElement(findElementByLinktext(BookingConfirmationLocators.logout), 20);
		
		
	}

}
