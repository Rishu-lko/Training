package com.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.framework.BaseClass;


public class MixImplicitExplicitWait extends BaseClass {
	
	@Test(priority=1,description="When Element is found immediately.",enabled=false)
	public void mixImplicitExplicitWaitImmediateFound() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.redbus.in/");
		APP_LOG.info("Start Time :" + new Date());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		APP_LOG.info("End Time :" + new Date());	
		driver.quit();
			
	}
	
	@Test(priority=2,description="When Element is not found and Explicit Wait is more than Implicit Wait.",enabled=true)
	public void mixImplicitExplicitWaitNotFound() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		try {		
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver1,15);
		driver1.get("https://www.redbus.in/");
		APP_LOG.info("Start Time :" + new Date());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrong locator")));
		}
		catch(Exception e) {
			APP_LOG.error(e.getMessage());			
			APP_LOG.info("End Time :" + new Date());	
			driver1.close();
					
		}
		
	}
	
	@Test(priority=3,description="When Element is not found and implicit wait is same or greater than explicit wait.",enabled=true)
	public void mixImplicitExplicitWaitNotFoundTest2() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		try {		
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver1,20);
		driver1.get("https://www.redbus.in/");
		APP_LOG.info("Start Time :" + new Date());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrong locator")));
		}
		catch(Exception e) {
			APP_LOG.error(e.getMessage());			
			APP_LOG.info("End Time :" + new Date());	
			driver1.close();
					
		}
		APP_LOG.info("End Time :" + new Date());
		
	}
	
	

}
