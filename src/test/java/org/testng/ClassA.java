package org.testng;

//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA {
	
	@Test(priority=1)
	public void test1() {
		
		System.out.println("gmail inbox test");
	}
	@Test(priority=2)
	public void test2() {
		
		System.out.println("gmail login test");
	}
}
