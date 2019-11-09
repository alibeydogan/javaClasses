package com.class15;

public class StringMoreExamples {
	public static void main(String[] args) {
		//get character at specific position charAt();
		
		String str="Syntax Technologies Inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		//length=19
	//	System.out.println(str.charAt(str.length()));//StringIndexOutOfBonds
		System.out.println(str.charAt(str.length()-1));
		
		//get substring from a String
		//Syntax
		String substr1=str.substring(0, 6);
		System.out.println(substr1);
		//Technolgies Inc
		String substr2=str.substring(7);
		System.out.println(substr2);
	}

}
