package org.pageexecution;

import org.baseclass.BaseClass;
import org.locators.SearchHotelLocators;

public class SearchHotelExecution extends LoginPageExecution{ 
	
	public static void selectLocation() {
		BaseClass.dropDownSelectbyvisibletext(BaseClass.excelFormat(5, 2), findElementById(SearchHotelLocators.Location));
	}
	
	public static void selectHotel() {
		BaseClass.dropDownSelectbyValue(BaseClass.excelFormat(6, 2), findElementById(SearchHotelLocators.Hotels));
	}
	
	public static void selectRoomtype() {
		BaseClass.dropDownSelectbyvisibletext(BaseClass.excelFormat(7, 2), findElementById(SearchHotelLocators.roomtype));
	}
	
	public static void selectNumberofRooms() {
		BaseClass.dropDownSelectbyValue(BaseClass.excelFormat(8, 2), findElementById(SearchHotelLocators.noofroomtype));
		
	}
	
	public static void selectCheckInDate() {
		BaseClass.sendData(findElementById(SearchHotelLocators.check_in_date), BaseClass.excelFormat(9, 2), 10);
	}
	
	public static void selectCheckOutDate() {
		BaseClass.sendData(findElementById(SearchHotelLocators.check_out_date), BaseClass.excelFormat(10, 2), 10);
	}
	
	public static void selectAdultsPerRoom() {
		BaseClass.dropDownSelectbyValue(BaseClass.excelFormat(11, 2), findElementById(SearchHotelLocators.adults_per_room));
	}
	
	public static void selectChildernPerRoom() {
		BaseClass.dropDownSelectbyValue(BaseClass.excelFormat(12, 2), findElementById(SearchHotelLocators.child_per_room));
	}
	
	public static void selectSearch() {
		BaseClass.clickonElement(findElementById(SearchHotelLocators.search), 10);
	}
	
	
	

}
