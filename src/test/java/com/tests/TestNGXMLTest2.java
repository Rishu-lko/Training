package com.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGXMLTest2 {
	
	 @Test(priority = 3, groups= {"testd"}, dependsOnMethods="teste")
	    public void testd() {
	        System.out.println("testd from " + getClass().getSimpleName() + " class");
	    }

	    @Test(priority = 5 , groups= {"teste"})
	    public void teste()  {
	        System.out.println("teste from " + getClass().getSimpleName() + " class");
	        //throw new Exception("Skip teste");
	    }
	    
	    @Test(priority = 5 , groups= {"testa"})
	    public void testa() {
	        System.out.println("testa from " + getClass().getSimpleName() + " class");
	      throw new SkipException("Skip teste");
	    }

}
