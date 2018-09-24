package com.tests;

class Base {
	

		public void display() {
		System.out.println("Static or class method from Base");
		}
		static void print() {
		System.out.println("Non-static or instance method from Base");
		}
	
}

class Derived extends Base {
	public void display() {
	System.out.println("Static or class method from Derived");
	}
	static void print() {
	System.out.println("Non-static or instance method from Derived");
	}
}
	
		
		public class PrivateStaticMethodOveridding {
			public static void main(String args[])
			{
				Base obj= new Derived();
				obj.display();
				obj.print();
			}
			}
