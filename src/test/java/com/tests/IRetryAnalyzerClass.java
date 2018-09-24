package com.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.framework.BaseClass;

public class IRetryAnalyzerClass extends BaseClass implements IRetryAnalyzer {

	private int retryCnt = 0;
	
	private int maxRetryCnt = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(retryCnt < maxRetryCnt) {
			APP_LOG.info("Retrying Test: "+result.getName()+" : Retry Coynt : "+ (retryCnt+1));
			retryCnt++;
			return true;
		}
		return false;
	}

}
