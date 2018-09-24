package com.tests;

import java.util.ArrayList;
import java.util.List;

class AccessModifierCheck {
	 
	 protected  static class Ratnesh{
		 
		 public void display() {
			 System.out.println("Inside Static");
		 }
		 
	 }
	 
	 protected static class Singh extends Ratnesh{
		 
		 public static void main(String args[]) {
			 Singh obj = new Singh();
			 obj.display();
			 
		 }
		 
	 }
	

}
 
 
class FinalCheck {
	 	 
	static String x= "Ratnesh";
		private static final   int a = 10;
		public static void main(String args[]) {
			System.out.println(FinalCheck.a);
			x = "Singh";
			ArrayList<Integer> list = new ArrayList<Integer>();
			
		}
		
		public  void method() {
			x = "Singh";
		}
		
	 
}
	 
	
