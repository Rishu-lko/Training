package com.tests;

import com.framework.BaseClass;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.tests.IAnnotationTransformerClass.class)

public class StringFunctions extends BaseClass {
	
	
	@Test
	public void checkStringReplace() {
		
		String a = "Ratnesh";
		String b = "Ratnesh";
		String c = new String("Ratnesh");
		StringBuffer d = new StringBuffer("Ratnesh");
		StringBuffer e =  d.reverse();
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(d==e);
		Assert.assertTrue(false);
		
		
	}
	
	@Test
	//Creating a method getScreenshot and passing two parameters 
	//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	                //below line is just to append the date format with the screenshot name to avoid duplicate names		
	                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;		
			File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
			return destination;

	}

}
