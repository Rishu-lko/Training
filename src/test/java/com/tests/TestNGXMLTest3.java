package com.tests;

import org.testng.annotations.Test;

public class TestNGXMLTest3 {
	
	 @Test(priority = 3)
	    public void testg() {
	        System.out.println("testg from " + getClass().getSimpleName() + " class");
	    }

	    @Test(priority = 5)
	    public void testh() {
	        System.out.println("testh from " + getClass().getSimpleName() + " class");
	    }

}
