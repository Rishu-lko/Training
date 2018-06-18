package com.tests;

import org.testng.annotations.Test;

import com.framework.BaseClass;

public class InitializerBlock extends BaseClass {
	
{
		
		APP_LOG.info("Calling Constructor:");	
	}
	
	
	InitializerBlock(int a){
		
		APP_LOG.info(a);
		
		
	}
		
	

InitializerBlock(int a, int b){
	APP_LOG.info(a+b);
		
	}
	
InitializerBlock(int a, int b, int c){
	
	APP_LOG.info(a+b+c);
}
	
InitializerBlock(){
	APP_LOG.info("Constructor with default argument.");
	
}

public static void main(String args[]) {
	
	InitializerBlock init1 = new InitializerBlock();
	InitializerBlock init2 = new InitializerBlock(1);
	InitializerBlock init3 = new InitializerBlock(1,2);
	InitializerBlock init4 = new InitializerBlock(1,2,3);
	
}

}
