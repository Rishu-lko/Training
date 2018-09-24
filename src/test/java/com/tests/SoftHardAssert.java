package com.tests;
import com.framework.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssert extends BaseClass{
	
	@Test (groups= {"first","second"})
	@SuppressWarnings("unused")
	public void verifyHardReset(){
		try {
		int rat = 1;
		APP_LOG.info("Before Hard Reset Exception");
		Assert.assertTrue(false);
		APP_LOG.info("After Hard Reset Exception");
		}
		catch(AssertionError e) {
			
			APP_LOG.info("AssertionError Exception Catched");
		}
		
	}
	
	@Test (groups="second")
	public void verifySoftReset(){
		try {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(false);
		APP_LOG.info("Before Soft Reset Exception");
		softAssert.assertTrue(false);
		APP_LOG.info("After Soft Reset Exception");
		softAssert.assertAll();
		}
		
catch(AssertionError e) {
			
			APP_LOG.info("AssertionError Exception Catched");
		}
		
	}

}
