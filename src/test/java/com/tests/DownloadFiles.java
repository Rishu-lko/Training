package com.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.framework.BaseClass;

public class DownloadFiles extends BaseClass{
	
	//@Test
	@SuppressWarnings({"unused","deprecation"})
	public void downloadFileChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		String downloadPath = System.getProperty("user.dir")+"\\src\\test\\resources\\essentials\\web\\DownloadedFiles";
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get("https://www.softpost.org/selenium-test-page/");
		driver.findElement(By.linkText("Download")).click();
		TimeUnit.SECONDS.sleep(20);
		driver.close();
		
	}
	
	
	//@Test
	@SuppressWarnings({"unused","deprecation"})
	public void downloadFileFireFoxBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver.exe");
		String downloadPath = System.getProperty("user.dir")+"\\src\\test\\resources\\essentials\\web\\DownloadedFiles";
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.folderList", 2);
		options.addPreference("browser.download.manager.showWhenStarting", false);
		options.addPreference("browser.download.dir", downloadPath);
		options.addPreference("browser.helperApps.neverAsk.openFile","text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		options.addPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		options.addPreference("browser.helperApps.alwaysAsk.force", false);
		options.addPreference("browser.download.manager.alertOnEXEOpen", false);
		options.addPreference("browser.download.manager.focusWhenStarting", false);
		options.addPreference("browser.download.manager.useWindow", false);
		options.addPreference("browser.download.manager.showAlertOnComplete", false);
		options.addPreference("browser.download.manager.closeWhenDone", false);
		DesiredCapabilities cap = DesiredCapabilities.firefox();
     	cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		WebDriver driver = new FirefoxDriver(cap);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.manage().window().maximize();		
		driver.get("https://www.softpost.org/selenium-test-page/");
		driver.findElement(By.linkText("Download")).click();
		TimeUnit.SECONDS.sleep(5);
		//driver.switchTo().alert().accept();
		//driver.close();
		
	}
	
	
	@Test
	public void downloadFileWayThree() throws IOException {
		System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softpost.org/selenium-test-page/");
		driver.findElement(By.linkText("Download")).click();
		Runtime.getRuntime().exec("D:\\DownloadNew.exe");
			
	}

}
