package org.pageexecution;

import org.baseclass.BaseClass;
import org.locators.SelectHotelLocators;

public class SelectHotelPageEExecution extends SearchHotelExecution{
	
	public static void select_radiobutton() {
		
		BaseClass.clickonElement(findElementById(SelectHotelLocators.radio), 10);
	}
	
	public static void select_continue() {
		
		BaseClass.clickonElement(findElementById(SelectHotelLocators.cont), 10);
	}
	
	

}
