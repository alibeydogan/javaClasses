package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) {
		
		/*
		 * this method checks whether a String is empty or not
		 * This method returns true if the given string
		 * is empty, else it returns false
		 */
		
		String str="";
		System.out.println("Is this string empty= \n"+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty="+str2.isEmpty());
		
//		if(!str.isEmpty()) {
//			System.out.println("This is not empty");
//		}else {
//			System.err.println("This is empty String");
//		}
		
		String sentence="Each day has a promise to brigten up the day, \nBut first you must allow the sun to come your way";
		System.out.println(sentence);
		
		System.out.println("-------------------------------------------------------------------");
		
		/*
		 * This method appends one String to the end of another
		 * The method returns a string with the value of the
		 * string passed in to the method appended to the end
		 * of the string used to invoke this method
		 */
		
		String str3="Hello ";
		String str4="World ";
		String str5="People ";
		
		
		System.out.println(str3+str4+str5);
		System.out.println(str3.concat(str4).concat(str5));
		System.out.println("--------------------------------------------------------------------");
		
		/*
		 * This method returns a copy of the string,
		 * with leading and trailing whitespace omitted
		 */
		String str6=" How are you ? ";
		System.out.println(str6.trim());
		System.out.println("--------------------------------------------------------------------");

		/*
		 * This method returns the character located at the String's specified index
		 * The string indexes strat from zero
		 */
		
		String str7="we might be done early today";
		System.out.println(str7.charAt(3));
		
		System.out.println("--------------------------------------------------------------------");
		/*
		 * This method returns the index within this string of the
		 * first occurrence of the specified character or -1
		 * if the character does not occur
		 */

		String str8="We might mnot be done early";
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('z', 0));
		System.out.println("--------------------------------------------------------------------");

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
