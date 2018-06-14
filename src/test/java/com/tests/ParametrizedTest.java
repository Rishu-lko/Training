package com.tests;

import org.testng.annotations.Test;
import com.framework.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.annotations.DataProvider;
import org.testng.ITestContext;
import java.util.Map;

public class ParametrizedTest extends BaseClass{
	@Test(groups= {"xml"})
	@Parameters({"parameter1","parameter2"})
	public void parametrizedTest(@Optional("0") int argument1,@Optional("0") int argument2) {		
		APP_LOG.info(argument1 +"," +argument2);
		
	}
	
	@Test(dataProvider="getData",groups= {"data"})
	public void parametrizedTestMultiValue(int argument1,int argument2) {		
		APP_LOG.info(argument1 +" , "+argument2);
		
	}
	
	@DataProvider(name="getData")
	public Integer[][] datafetch(ITestContext context) {
	//Map<String,String> localParameters = context.getCurrentXmlTest().getLocalParameters();
	//Map<String,String> allParameters = context.getCurrentXmlTest().getAllParameters();
	//Map<String,String> allParameters = context.getCurrentXmlTest().get
	String parameter = context.getCurrentXmlTest().getAllParameters().get("parameter");
	String[] paramerarray=	parameter.split(",");
	Integer[][] returnValues = new Integer[paramerarray.length][2];
	for(int i =0;i<paramerarray.length;i++) {
		returnValues[i][0]=Integer.valueOf(i);
		returnValues[i][1]=Integer.valueOf(paramerarray[i]);
		
	}
	return returnValues;		
	}


}
