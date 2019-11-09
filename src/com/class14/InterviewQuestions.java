package com.class14;

public class InterviewQuestions {
	public static void main(String[] args) {
		//1.Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		
		//2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		int[]array= {3,5,78,231,566,433};
		
		
		//3.Find out how many alpha characters present in a string?
		String str="abcdfeghijk";
		System.out.println(str.length());
		System.out.println("--------------");
		
		
		//4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		String str1="Hello how are you ?";
		System.out.println(str1.indexOf("how"));
		System.out.println("-------------");
		
		
		
		//5.Write a java program to reverse String? Reverse a string word by word?
		String word = "Hello";
		for (int i = word.length()-1; i >=0; i--) {
			System.out.print(word.charAt(i));
		}System.out.println();
		System.out.println("------------");
		
		
		
		//6.Write a Java Program to find whether a String is palindrome or not?
		String name="mom";
		//name.charAt(i);
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}System.out.println();
		System.out.println("------------");
		
		//7.Write a java program to check whether a given number is prime or not?
		int num=101;
		if(num%2!=0 || num/3!=0 || num/5==0 || num/7==0 || num/11==0) {
			System.out.println("not prime");
		}
		System.out.println("-------------");
		
		//8.Write a Java Program to print first 10 numbers of Fibonacci series.
		
		for(int i=1; i<257; i+=i) {
			System.out.println(i);
	}
	}

}
