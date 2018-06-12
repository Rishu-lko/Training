package com.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InitClass {
	private static Logger APP_LOG = null;
	
	public static String now(String dateFormat) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
		
	}
	
	public static synchronized Logger initializeLogger(String resourcePath,String device) {
		 
		try {
		 String logDate = now("dd.MMM.yyyy.HH.mm.ss");
		 String fileSeparator = System.getProperty("file.separator");
		 System.setProperty("log.dir",System.getProperty("user.dir")+fileSeparator+resourcePath+"essentials"+fileSeparator+device+fileSeparator+"testLogs"+fileSeparator+"ApplicationLog_" + logDate + ".log");
		 PropertyConfigurator.configure(
				 resourcePath+
				 "configFiles/propertiesFile/log4j.properties");
		 APP_LOG= Logger.getLogger("automation");
		 APP_LOG.debug("Initialized Logger :" +resourcePath+"essentials ::"+device+ " - "+logDate);
		 APP_LOG.debug("Logger Initiated.");
		}
		catch(Exception e){
			APP_LOG.error("Exception during Logger Creation");
			return null;
			
		}
		return APP_LOG;
		 		 
		
	}

}
