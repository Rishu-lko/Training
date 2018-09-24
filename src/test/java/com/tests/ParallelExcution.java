package com.tests;

import com.framework.BaseClass;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

public class ParallelExcution extends BaseClass{
//	String fileSeparator = System.getProperty("file.separator");
//	@Test
//	public void invokeChromeFaceBook() throws InterruptedException {
//	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+fileSeparator+resourcePath+fileSeparator+"drivers"+fileSeparator+"geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
//	driver.get("http://www.facebook.com");
//	APP_LOG.debug("Firefox Facebook Opened.");
//	TimeUnit.SECONDS.sleep(10);
//	driver.close();
//	APP_LOG.debug("Firefox Facebook Closed.");
//	}
//	
//	@Test
//	public void invokeFirefoxFaceBook() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+fileSeparator+resourcePath+fileSeparator+"drivers"+fileSeparator+"chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.facebook.com");
//		APP_LOG.debug("Chrome Facebook Opened.");
//		TimeUnit.SECONDS.sleep(10);
//		driver.close();
//		APP_LOG.debug("Chrome Facebook Closed.");			
//	}
//	
//	@Test
//	public void invokeIE() throws InterruptedException {
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+fileSeparator+resourcePath+fileSeparator+"drivers"+fileSeparator+"IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("http://www.facebook.com");
//		APP_LOG.debug("IE Opened.");
//		TimeUnit.SECONDS.sleep(10);
//		driver.close();
//		APP_LOG.debug("IE Closed.");
//		
//	}
//	
//	
//	@Test
//	public void invokeChromeYoutube() throws InterruptedException {
//	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+fileSeparator+resourcePath+fileSeparator+"drivers"+fileSeparator+"geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
//	driver.get("http://www.youtube.com");
//	APP_LOG.debug("Firefox Youtube Opened.");
//	TimeUnit.SECONDS.sleep(10);
//	driver.close();
//	APP_LOG.debug("Firefox Youtube Closed.");
//	}
//	
//	@Test
//	public void invokeFirefoxYoutube() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+fileSeparator+resourcePath+fileSeparator+"drivers"+fileSeparator+"chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.youtube.com");
//		APP_LOG.debug("Chrome Youtube Opened.");
//		TimeUnit.SECONDS.sleep(10);
//		driver.close();
//		APP_LOG.debug("Chrome Youtube Closed.");			
//	}
	
	@Test(priority=0)
	public void parallelTest1() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
		APP_LOG.info("Class1: Parallel 1");
	}
	@Test(priority=0)
	public void parallelTest2() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class1: Parallel 2");
	}
	@Test(priority=0)
	public void parallelTest3() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class2: Parallel 3");
	}
	@Test(priority=0)
	public void parallelTest4() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class1: Parallel 4");
	}
	@Test(priority=0)
	public void parallelTest5() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class1: Parallel 5");
	}
	@Test(priority=0)
	public void parallelTest6() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class1: Parallel 6");
	}
	
	@Test(priority=0)
	public void parallelTest7() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class1: Parallel 7");
	}

}
