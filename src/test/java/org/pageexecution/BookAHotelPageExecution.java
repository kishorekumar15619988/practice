package org.pageexecution;

import org.baseclass.BaseClass;
import org.locators.BookAHotelLocators;

public class BookAHotelPageExecution extends SelectHotelPageEExecution{
	
	public static void firstname() {
		BaseClass.sendData(BaseClass.findElementById(BookAHotelLocators.firstname), BaseClass.excelFormat(15, 2), 10);
	}
	
	public static void lastname() {
		BaseClass.sendData(BaseClass.findElementById(BookAHotelLocators.lastname), BaseClass.excelFormat(16, 2), 20);
	}
	
	public static void billingaddress() {
		BaseClass.sendData(BaseClass.findElementById(BookAHotelLocators.billingaddress), BaseClass.excelFormat(17, 2), 10);
	}
	
	public static void creditcardnumber() {
		BaseClass.sendData(BaseClass.findElementById(BookAHotelLocators.creditcardnumber), BaseClass.excelFormat(18, 2), 10);
	}
	
	public static void selectcreditcardtype() {
		BaseClass.dropDownSelectbyvisibletext(BaseClass.excelFormat(19, 2), findElementById(BookAHotelLocators.credittype));
	}
		
	
	
	public static void selectexpiry_month() {
		BaseClass.dropDownSelectbyvisibletext(BaseClass.excelFormat(20, 2), findElementById(BookAHotelLocators.expirymonth));
	}
	
	public static void selectexpiry_year() {
		BaseClass.dropDownSelectbyvisibletext(BaseClass.excelFormat(21, 2), findElementById(BookAHotelLocators.expiryyear));
	}
	
	public static void cvvnumber() {
		BaseClass.sendData(BaseClass.findElementById(BookAHotelLocators.cvvnumber), BaseClass.excelFormat(22, 2), 10);
	}
	
	public static void clickbook_now() {
		BaseClass.clickonElement(findElementById(BookAHotelLocators.booknow), 10);
	}
	
	public static void clickCancel() {
		BaseClass.clickonElement(findElementById(BookAHotelLocators.cancel), 10);
	}
	
	
	
	
	
	
	

}
