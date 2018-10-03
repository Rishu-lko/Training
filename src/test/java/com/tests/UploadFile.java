package com.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.framework.BaseClass;

public class UploadFile extends BaseClass {

	//@Test
	public void uploadFileTestWayOne() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.softpost.org/selenium-test-page/");
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\debug.log");

	}

	@Test
	public void uploadFileTestWayTwo() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.softpost.org/selenium-test-page/");
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",element);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Upload.exe");

	}
}
