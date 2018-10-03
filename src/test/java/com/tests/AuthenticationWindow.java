package com.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.framework.BaseClass;

public class AuthenticationWindow extends BaseClass {

	@Test
	public void authenticationWindowWayOne() throws InterruptedException {
		String userName = "Ratnesh";
		String password = "Singh";
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://" + userName + ":" + password + "@www.engprod-charter.net/");
	}
	
	@Test
	public void authenticationWindowWayTwo() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://@www.engprod-charter.net/");
		Thread.sleep(6000);
        Runtime.getRuntime().exec("D:\\auth.exe");
	}
	

}
