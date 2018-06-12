package com.tests;

import org.testng.annotations.Test;

public class TestNGXMLTest1 {
	
	@Test(priority = 2)
    public void testa() {
        System.out.println("testa from " + getClass().getSimpleName() + " class");
    }

    @Test(priority = 2)
    public void testb() {
        System.out.println("testb from " + getClass().getSimpleName() + " class");
    }
    
    @Test(priority = 2)
    public void testc() {
        System.out.println("testc from " + getClass().getSimpleName() + " class");
    }
    
    @Test(priority = 5)
    public void testf() {
        System.out.println("testf from " + getClass().getSimpleName() + " class");
    }

}
