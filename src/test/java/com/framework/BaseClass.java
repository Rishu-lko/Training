package com.framework;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.util.InitClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class BaseClass {
	
  protected WebDriver webDriver=null;
  protected static String browser=null;
  protected static String url=null;
  protected static String username=null;
  protected static String password=null;
  protected static String resourcePath = null;
  protected static String device = null;
  protected static Logger APP_LOG = null;
  
  
   
  static {
	  	  
	  init();
	  	  
  }
  
 
  @BeforeClass (alwaysRun=false,enabled=false)
  protected void intializeWebDriver() {
	 
	  
	  switch(BaseClass.browser)
	  {
	   case "Chrome":
		   initializeChromeDriver();
		   launchApp();
		   
		   break;
		   
	   case "IE":
		   initializeIEDriver();
		   launchApp();
		   break;
		   
	   case "FireFox":
		   initializeFireFoxDriver();
		   launchApp();
		   break;
		  
	  default:
		 
		  break;	  
	  
	  }
	  
  }
  
  private void initializeChromeDriver() {
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	  this.webDriver = new ChromeDriver();
	  
  }
  
  private void initializeFireFoxDriver() {
	  
	  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
	  this.webDriver = new FirefoxDriver();
	  
  }

  private void initializeIEDriver() {
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\IEdriverserver.exe");
	  this.webDriver = new InternetExplorerDriver();
	  
}
  
  private void launchApp() {
	 this.webDriver.get(BaseClass.url); 
  }
  
  
  @AfterClass(alwaysRun=false,enabled=false)
  protected void tearDown(){
	 
	  if (BaseClass.browser.equalsIgnoreCase("IE")) {
		  
		  try {
			  Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
			  } 
		  
		   catch (IOException e) {
			  e.printStackTrace();
			  } 
	  }
	  else {
	 
		  this.webDriver.quit();
	  }
	  this.webDriver = null;
	  BaseClass.browser = null;
	  BaseClass.url = null;
	  
  }
  private static synchronized void init() {
	  
	  BaseClass.browser=PropertyManager.getInstance().valueFromConfig("browser");
	  BaseClass.url=PropertyManager.getInstance().valueFromConfig("url");
	  BaseClass.resourcePath=PropertyManager.getInstance().valueFromConfig("resourcePath");
	  BaseClass.device=PropertyManager.getInstance().valueFromConfig("device");
	  BaseClass.APP_LOG= InitClass.initializeLogger(BaseClass.resourcePath,BaseClass.device);
  } 

}
