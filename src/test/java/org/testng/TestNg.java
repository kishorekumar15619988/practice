package org.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

@BeforeTest
public void beforetest() {
	System.out.println("beforetest");
}

@Test
public void test() {
	
	System.out.println("test1");
}


}
