package org.junit;

import java.util.Date;

import org.baseclass.BaseClass;
import org.finalexecution.FinalExecution;

public class Junit extends FinalExecution{

	@BeforeClass
	public static void lauchbrowser() {
		browerlaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
		
	}
	
	
	@Test
	public void runnable() {
		//Login page
		username();
		password();
		clickButton();
		//Search hotel page
		selectLocation();
		selectHotel();
		selectNumberofRooms();
		selectRoomtype();
		selectAdultsPerRoom();
		selectCheckInDate();
		selectCheckOutDate();
		selectChildernPerRoom();
		selectSearch();
		//Select hotel page
		select_radiobutton();
		select_continue();
		//Book a hotel page
		firstname();
		lastname();
		billingaddress();
		creditcardnumber();
		selectcreditcardtype();
		selectexpiry_month();
		selectexpiry_year();
		cvvnumber();
		clickbook_now();

		//confirmation Page
		logout();
		
	}
	
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("After Method");
	}
	@AfterClass
	public static void runnable2() {
		BaseClass.screenShot();
	}
	
	
}
