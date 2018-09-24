package com.tests;

import com.framework.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTestInTestNG extends BaseClass{

	@Test(expectedExceptions= {ArithmeticException.class,AssertionError.class})
	public void verifyExceptionTest(){
		Assert.assertTrue(false);
		int i = 1/0;
		
	}

}
