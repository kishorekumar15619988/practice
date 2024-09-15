package org.pageexecution;

import org.baseclass.BaseClass;
import org.locators.BookingConfirmationLocators;
import org.locators.LoginPageLocators;
import org.locators.SearchHotelLocators;

public class LoginPageExecution extends BookingConfirmationLocators{
	
	public static void username() {
		
		BaseClass.sendData(BaseClass.findElementById(LoginPageLocators.username), BaseClass.excelFormat(1, 2), 10);
	}
	//"vasanth26"
	public static void password() {
		BaseClass.sendData(BaseClass.findElementById(LoginPageLocators.password), BaseClass.excelFormat(2, 2), 10);
	}
	//"QHU777"
	public static void clickButton() {
		BaseClass.clickonElement(BaseClass.findElementById(login), 10);
	}
	
	

}
