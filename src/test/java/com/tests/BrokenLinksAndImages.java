package com.tests;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.framework.BaseClass;

public class BrokenLinksAndImages extends BaseClass {
	
	@Test
	public void brokenLinksAndImagesWayOne() {
		String baseURL = "http://www.zlti.com/";
		String url = null;
		int respCode = 200;
		HttpURLConnection huc= null;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		List<WebElement> urls = driver.findElements(By.tagName("a"));
//		Iterator itr = urls.iterator();
// 		while(itr.hasNext()) {
// 			url = ((WebElement) itr.next()).getAttribute("href");
// 			
// 		}
		for(WebElement ele:urls) {		
			url = ele.getAttribute("href");
			if(url==null || url.isEmpty()) {
				continue;
			}
			if(!url.startsWith(baseURL)) {
				continue;
			}
			try {
				huc = (HttpURLConnection)(new URL(url).openConnection() );
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				if(respCode >=400) {
					APP_LOG.info("URL Broken :" + url);
				}
				else {
					APP_LOG.info("URL is not Broken :" + url);
				}
			}
			catch(MalformedURLException e) {
				APP_LOG.info(e.getStackTrace());
			}
			catch(IOException io) {
				APP_LOG.info(io.getStackTrace());
			}
			
		}
		
		
	}

}
