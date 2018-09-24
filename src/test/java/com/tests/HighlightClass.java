package com.tests;


	
	import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
	 
	public class HighlightClass {
	 
	 @Test
	 public void highlighterElement() throws InterruptedException {
	 
	 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.gmail.com");
	 TimeUnit.SECONDS.sleep(3);
	 WebElement ele = driver.findElement(By.xpath("//*[text()='Next']"));
	                //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
	
	 highLighterMethod(driver,ele);
	 ele.sendKeys("SoftwareTestingMaterial.com");
	 }
	 
	        //Creating a custom function
	 public void highLighterMethod(WebDriver driver, WebElement element){
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 }
	}


