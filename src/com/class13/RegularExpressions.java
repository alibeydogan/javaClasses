package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		
		/*
		 * priint only text and not numbers
		 */
		
		String str="123214Hel3434341lo123123123";//Hello
		System.out.println(str.replaceAll("[0-9]", "")); //leave only text
		System.out.println(str.replaceAll("[a-zA-Z]", "")); //leave only numbers
		
		
		//Remove everything except text and numbers
		String str2="Hi!'^+^How!'^'!'+^4546456";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("\\W", ""));
		
		

	}

}
