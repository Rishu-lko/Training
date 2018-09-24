package com.tests;

import java.util.Scanner;

import org.testng.annotations.Test;

import com.framework.BaseClass;

public class SelectionStatements extends BaseClass{
	
	@Test
	public void test_1() {
		first:
			for( int i = 1; i < 5; i++) {
			second:
			 for(int j = 1; j < 3; j ++ ) {
			 System.out.println("i = " + i + "; j = " +j);
			     if ( i == 2)
				 break;
			    }
			} 

	
	   
	}

}
