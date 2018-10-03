package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.framework.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginTest() {
   System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/index.php");
	driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("tutorial");
	}

}
