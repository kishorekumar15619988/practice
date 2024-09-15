package org.finalexecution;

import org.junit.Test;
import org.pageexecution.BookingConfirmationPageExecution;



public class FinalExecution extends BookingConfirmationPageExecution{

	
		
	
	
		@Test
		public  void junit() {
		browerlaunch("chrome");
		launchUrl("https://adactinhotelapp.com/");
		
	
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
		
}		
		
		
		
	


