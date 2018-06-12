package com.tests;

import org.testng.annotations.Test;

import com.framework.BaseClass;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadPropertiesFile extends BaseClass{
	
	public ReadPropertiesFile() {}
	
	@Test (priority=0,enabled=true)
	public void readPropertiesUsingFileInputStream() {
	String fileSeparator = System.getProperty("file.separator")	;
		
	//File file = new File(System.getProperty("user.dir")+"/src/test/resources/propread.properties");
	//File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\propread.properties");
	//File file = new File(System.getProperty("user.dir")+"//src//test//resources//propread.properties");
	//File file = new File("src/test/resources/propread.properties");
	//File file = new File("src//test//resources//propread.properties");
	//File file = new File("src\\test\\resources\\propread.properties");
	//File file = new File("src"+fileSeparator+"test"+fileSeparator+"resources"+fileSeparator+"propread.properties");
	//File file = new File("src"+File.separator+"test"+File.separator+"resources"+File.separator+"propread.properties");
	try {
	File file = new File("defaultPath.properties");
	
	
	if(file.exists()) {
		APP_LOG.info(file.getPath());
	}
	else {
		throw new FileNotFoundException();
	}
	
	
		
	} catch(Exception e) {
		
	}
	}
	
	
	

}
