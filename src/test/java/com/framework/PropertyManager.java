package com.framework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;

public class PropertyManager extends BaseClass {
	
	private InputStream inputStream;
	private Properties prop;
	private File file;
	
	public PropertyManager() {
		try 
		{
		 this.prop = new Properties();
		 
		 this.file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\propertiesFile\\config.properties");
		 
		String propFileName = "config.properties";
		//inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		inputStream = new FileInputStream(this.file);
		if (inputStream != null) {
			prop.load(inputStream);
		}
		else {
		throw new FileNotFoundException("Property File :"+propFileName);	
		}	
		}
		catch (Exception e){
			System.out.println("Exception: " + e);
		}
		finally {
			try {
			inputStream.close();
			}
			catch (IOException e){
				System.out.println("IOException: " + e);
			}
		}
		
	}
	
	public static PropertyManager getInstance() {
		return new PropertyManager();
	}
	
	public String valueFromConfig(String Key) {
		
		return this.prop.getProperty(Key);
	}
	
}
