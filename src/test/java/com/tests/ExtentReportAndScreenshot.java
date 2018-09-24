package com.tests;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.framework.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportAndScreenshot extends BaseClass {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;

	public static String takeScreenshot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("dd.MMMMM.yyyy.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/src/test/resources/essentials/web/screenShots/"
				+ screenshotName + "_" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	// @Test
	public void verifyTakeScreenshot() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!js.executeScript("return document.readyState").equals("complete")) {
			TimeUnit.SECONDS.sleep(3);
		}
		takeScreenshot(driver, "sampleScreenshot");
		// APP_LOG.info(System.getProperty("user.name"));
	}

	@BeforeClass
	public void startReport() {
		extent = new ExtentReports(
				System.getProperty("user.dir") + "/src/test/resources/essentials/web/reports/extentTestReport.html",
				true);
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("Host Name", "Localhost");
		extent.addSystemInfo("User Name", System.getProperty("user.name"));
		extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
	}

	@Test(priority = 0)
	public void testPass(Method method) throws Exception {
		logger = extent.startTest(method.getName());
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!js.executeScript("return document.readyState").equals("complete")) {
			TimeUnit.SECONDS.sleep(3);
		}
		Assert.assertEquals(driver.getTitle(), "Google");
		//
	}

	@Test(priority = 1)
	public void failTest(Method method) throws Exception {
		logger = extent.startTest(method.getName());
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!js.executeScript("return document.readyState").equals("complete")) {
			TimeUnit.SECONDS.sleep(3);
		}
		Assert.assertEquals(driver.getTitle(), "Google Not");

	}

	@Test(priority = 2)
	public void skipTest(Method method) throws Exception {
		logger = extent.startTest(method.getName());
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		while (!js.executeScript("return document.readyState").equals("complete")) {
			TimeUnit.SECONDS.sleep(3);
		}
		Assert.assertEquals(driver.getTitle(), "Google Not");
		throw new SkipException("Skipping Test" + method.getName());
	}

	@AfterMethod
	public void resultLog(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String screenshotPath = takeScreenshot(driver, result.getName());
			logger.log(LogStatus.PASS, "Test case passed : " + result.getName());
			logger.log(LogStatus.PASS, "Here is screenshot :" + logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			driver.close();
		}
		else if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotPath = takeScreenshot(driver, result.getName());
			logger.log(LogStatus.FAIL, "Test case failed : " + result.getName());
			logger.log(LogStatus.FAIL, "Here is failure screenshot :" + logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			driver.close();
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			String screenshotPath = takeScreenshot(driver, result.getName());
			logger.log(LogStatus.SKIP, "Test case failed : " + result.getName());
			logger.log(LogStatus.SKIP, "Here is failure screenshot :" + logger.addScreenCapture(screenshotPath));
			extent.endTest(logger);
			driver.close();
		}

	}
	
	@AfterClass
	public void afterClass() {
		
		extent.flush();
	}

}
