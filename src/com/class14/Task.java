package com.class14;

public class Task {
	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence.
		 * Write a program to get a new String without any spaces.
		 */
		
		String str="Hey I am in java class today. After the class i need to study. It is important.";
		System.out.println(str.replaceAll(" ", ""));
		
		System.out.println("-----------------------");
		/*
		 * Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many alpha characters are there in the String.
		 */
		String str1="as123sfd'^+!^dsa123'^d";
		String str2=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str2.length());
		
		
		
		System.out.println("-----------------------");
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		 *  How would you find out how many sentences are in that String?
		 */
		String str3="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array=str3.split("\\?");
		System.out.println(array.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
