package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.util.ArrayList;

import com.framework.BaseClass;
import com.framework.PropertyManager;

public class SeleniumNewTab extends BaseClass{
		
  public void SeleniumNewTab() {
	  
  }
  
  @Test(enabled=true)
  public void VerifyUserIsAbleToLogin() throws InterruptedException
  {
	 try { String linkInNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
	  webDriver.findElement(By.linkText("Gmail")).sendKeys(linkInNewTab); 
	  webDriver.get("about:blank");
	  ((JavascriptExecutor)webDriver).executeScript("window.open('about:blank','_blank')");	  
	  ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
	  webDriver.switchTo().window(tabs.get(0));
	  webDriver.switchTo().window(tabs.get(1));
	  webDriver.switchTo().window(tabs.get(2));
	  }
	  
 
  catch (ElementNotVisibleException e) {}
	 
  }
}
