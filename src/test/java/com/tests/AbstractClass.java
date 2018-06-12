package com.tests;

import org.testng.annotations.Test;

import com.framework.BaseClass;

public abstract class AbstractClass extends BaseClass{

	@Test
	public abstract void test();
	
	@Test
	static void ratnesh() {}	
	
}
