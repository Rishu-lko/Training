package com.tests;

import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;
import com.framework.AttachExistingWebDriver;

import com.framework.BaseClass;

public class AttachingExistingBrowser extends BaseClass {
  
  public void AttachingExistingBrowser() {
  }
  
  @Test(enabled=true)
  public void VerifyUserIsAbleToLogin() throws InterruptedException
  {
	 
	    ChromeDriver driver = new ChromeDriver();
	    HttpCommandExecutor executor = (HttpCommandExecutor) driver.getCommandExecutor();
	    URL url = executor.getAddressOfRemoteServer();
	    SessionId session_id = driver.getSessionId();


	    RemoteWebDriver driver2 = AttachExistingWebDriver.createDriverFromSession(session_id, url);
	    driver2.get("http://tarunlalwani.com");
	  
  }
}
