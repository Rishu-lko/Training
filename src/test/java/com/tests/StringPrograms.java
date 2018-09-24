package com.tests;

import org.testng.annotations.Test;

import com.framework.BaseClass;

public class StringPrograms extends BaseClass {

	@Test
	public void reverseStringWayOne() {
		String name = "Ratnesh Singh";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		APP_LOG.info(reverse);

	}

	@Test
	public void reverseStringWayTwo() {

		String name = "Ratnesh Singh";
		char[] array = name.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--) {

			reverse += array[i];
		}
		APP_LOG.info(reverse);

	}

	@Test
	public void reverseStringWayThree() {
		String name = "Ratnesh Singh";
		// StringBuilder builder = new StringBuilder(name);
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		APP_LOG.info(buffer);
	}

	@Test
	public void reverseStringWayFour() {
		String name = "Ratnesh Singh";
		APP_LOG.info(StringPrograms.Reverse(name));

	}

	public static String Reverse(String name) {
		String reverse = "";
		if (name == null || name.length() <= 1) {
			return name;
		}
		reverse = name.substring(name.length() - 1) + StringPrograms.Reverse(name.substring(0, name.length() - 1));
		return reverse;
	}

	@Test
	public void removeExtraSpacesFromString() {
		String str = "  I    will   get       success   ";
		String removedSpaces = str.trim().replaceAll("[\\s]+", " ");
		APP_LOG.info(removedSpaces);

	}

}
