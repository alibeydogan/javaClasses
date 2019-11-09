package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		/*
		 * 5. Reverse a string word by word?	
		 */
		
		String given="Welcome to the Java Class";
		/*
		 * to reverse string
		 * split();
		 * Step1: Split--> array of String
		 * Step2: use for loop and decrement to print values
		 */
		String reversed="";
		String[] str=given.split("\\s");
		for (int i = str.length-1; i>=0; i--) {
			reversed=reversed+str[i]+" ";
		}
		System.out.println(reversed);
		
		
		//Write a java program to reverse String? 
		//toCharArray(); charAt(); 
		
		String given1="Today is Java Class";
		String replaced1="";
		char []charArray=given1.toCharArray();
		for (int i = charArray.length-1; i >=0;  i--) {
			replaced1=replaced1+charArray[i];
		}
		System.out.println(replaced1);
		
		System.out.println("---");
		//charAt();
		String word="I love Java";
		String reversed2="";
		for (int i = word.length()-1; i >=0; i--) {
			reversed2=reversed2+word.charAt(i);
		}
		System.out.print(reversed2);			

		
		
		
		
		
	}

}
