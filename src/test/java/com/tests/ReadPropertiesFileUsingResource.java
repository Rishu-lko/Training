package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.framework.BaseClass;

public class ReadPropertiesFileUsingResource extends BaseClass {

	//@Test
	public void readPropertyFileWayOne() {
		Properties prop = null;
		InputStream inputStream = null;

		try {
			prop = new Properties();
			inputStream = this.getClass().getClassLoader().getResourceAsStream("propread.properties");
			if (inputStream != null) {
				prop.load(inputStream);

			} else {
				throw new FileNotFoundException("Properties File Not Found: propread.properties");
			}
			APP_LOG.info(prop.getProperty("name"));
			APP_LOG.info(prop.getProperty("sirname"));
		} catch (Exception e) {
			APP_LOG.info("Exception Occurred :" + e.getStackTrace());

		} finally {
			try {
				inputStream.close();
			} catch (IOException io) {
				APP_LOG.info("Exception Occurred :" + io.getStackTrace());
			}

		}

	}
	
	//@Test
	public void readPropertyFileWayTwo() {
		Properties prop = null;
		InputStream inputStream = null;

		try {
			prop = new Properties();
			inputStream = this.getClass().getResourceAsStream("/propread.properties");
			if (inputStream != null) {
				prop.load(inputStream);

			} else {
				throw new FileNotFoundException("Properties File Not Found: propread.properties");
			}
			APP_LOG.info(prop.getProperty("name"));
			APP_LOG.info(prop.getProperty("sirname"));
		} catch (Exception e) {
			APP_LOG.info("Exception Occurred :" + e.getStackTrace());

		} finally {
			try {
				inputStream.close();
			} catch (IOException io) {
				APP_LOG.info("Exception Occurred :" + io.getStackTrace());
			}

		}

	}
	
	
	@Test
	public void readPropertyFileWayThree() {
		Properties prop = null;
		InputStream inputStream = null;

		try {
			prop = new Properties();
			File file = new File("defaultPath.properties");
			inputStream = new FileInputStream(file);
			if (inputStream != null) {
				prop.load(inputStream);

			} 
			APP_LOG.info(prop.getProperty("name"));
			APP_LOG.info(prop.getProperty("sirname"));
		} catch (IOException e) {
			APP_LOG.info("Exception Occurred :" + e.getStackTrace());

		} finally {
			try {
				inputStream.close();
			} catch (IOException io) {
				APP_LOG.info("Exception Occurred :" + io.getStackTrace());
			}

		}

	}

}
