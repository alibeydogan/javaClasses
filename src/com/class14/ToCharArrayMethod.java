package com.class14;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		
		/* .toCharArray
		 * This method converts this string to a new character array
		 */
		String str="Syntax";
		
		char[] array=str.toCharArray();
		System.out.println(str.toCharArray());
		
		for(char i:array) {
			System.out.println(i);
		}
		
		
		char b='w';
		char c='c';
		System.out.println(b+c);
		
	}

}
