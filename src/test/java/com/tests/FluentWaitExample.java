package com.tests;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.function.Function;

import com.framework.BaseClass;

public class FluentWaitExample extends BaseClass {
	
	@Test(description="Fluent Wait.",enabled=true)
	public void mixImplicitExplicitWaitNotFoundTest2() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {		
		driver.manage().window().maximize();
		//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(10, TimeUnit.SECONDS)
	    		.pollingEvery(5, TimeUnit.MICROSECONDS)
	    		.ignoring(NoSuchElementException.class);
				
		driver.get("https://www.redbus.in/");
		APP_LOG.info("Start Time :" + new Date());
		
		WebElement element = wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("wrong Locator"));
			}
			
		});
		
		}
		catch(Exception e) {
			APP_LOG.error(e.toString());			
			APP_LOG.info("End Time :" + new Date());	
			driver.close();
					
		}
		
		
	}

}
