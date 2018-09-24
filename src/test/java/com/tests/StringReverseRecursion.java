package com.tests;

import com.framework.BaseClass;

public class StringReverseRecursion extends BaseClass{
	
	 static String strReverse = "";

	   public static String reverse(String str) {

	       if (str.length() == 1) {
	           strReverse = strReverse + str;
	       } else { 
	           strReverse = strReverse
	                   + str.substring(str.length() - 1, str.length());
	           str = str.substring(0, str.length() - 1);
	           reverse(str);
	       }
	       return strReverse;

	   }

	   public static void main(String[] args) {
	       strReverse = reverse("my name is");
	       APP_LOG.info(strReverse);

	   }

}
