package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
		
		/*
		 * .contains();
		 * This method searches the sequence of characters in the string
		 * If the sequence of characters are found,
		 * then it returns true otherwise returns false
		 */
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("w"));
		
		//Create two String and initialize them with some value.
		//implement the following methods on those strings
		
		/*
		 * sen.length();
		 * sen.equals();
		 * sen.contains(s);
		 * sen.toUpperCase();
		 * sen.toLowerCase();
		 * sen.equalsIgnoreCase(anotherString);
		 */
		System.out.println("-------------------");
		/*
		 * this method test if a string starts with the
		 * specified prefix begining
		 */
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with="+str2.startsWith("It"));
		//System.out.println("Is this string starts with="+str2.startsWith("It", 3));

		/*
		 * This method tests if this string ends with
		 * the specified suffix
		 */
		
		

	}

}
