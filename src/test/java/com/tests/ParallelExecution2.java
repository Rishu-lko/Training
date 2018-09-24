package com.tests;
import com.framework.BaseClass;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

class ParallelExecution2 extends BaseClass{

	
	@Test(priority=0)
	public void parallelTest1() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
		APP_LOG.info("Class2: Parallel 1");
	}
	@Test(priority=0)
	public void parallelTest2() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class2: Parallel 2");
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
	
		APP_LOG.info("Class2: Parallel 4");
	}
	@Test(priority=0)
	public void parallelTest5() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class2: Parallel 5");
	}
	@Test(priority=0)
	public void parallelTest6() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class2: Parallel 6");
	}
	
	@Test(priority=0)
	public void parallelTest7() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class2: Parallel 7");
	}

}

class ParallelExecution3 extends BaseClass{

	
	@Test(priority=0)
	public void parallelTest1() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
		APP_LOG.info("Class2: Parallel 1");
	}
	@Test(priority=0)
	public void parallelTest2() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class2: Parallel 2");
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
	
		APP_LOG.info("Class2: Parallel 4");
	}
	@Test(priority=0)
	public void parallelTest5() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());
	
		APP_LOG.info("Class2: Parallel 5");
	}
	@Test(priority=0)
	public void parallelTest6() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class2: Parallel 6");
	}
	
	@Test(priority=0)
	public void parallelTest7() throws InterruptedException {
		APP_LOG.info("Start Time: "+ new Date());
		TimeUnit.SECONDS.sleep(3);
		APP_LOG.info("End Time: "+ new Date());

		APP_LOG.info("Class2: Parallel 7");
	}

}
