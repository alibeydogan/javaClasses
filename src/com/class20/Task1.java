package com.class20;

public class Task1 {
	public static void main(String[] args) {
		Task1 obj=new Task1();
		System.out.println(obj.reverseString("Syntax"));
		String result=obj.reverseString("Syntax");
		System.out.println(result);
		
	}

	public boolean isPalindrome(String word) {
		boolean result=false;
		String reversed=reverseString(word);
		if(word.equalsIgnoreCase(reversed)) {
			result=true;
		}else {
			result=false;
		}
		return true;
	}
	
	protected String reverseString(String word) {
		String reversed="";
		for(int i= word.length()-1; i>=0; i--) {
			reversed+=word.charAt(i);
		}
		return reversed;
		
	}
	
	
}
