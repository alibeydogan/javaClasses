package com.class7;

public class DoWhile {

	public static void main(String[] args) {
//mostly used
		int num = 10;

		while (num <= 7) {
			System.out.println("Hello");
			num++;
		}
		//rare
		int num1 = 10;

		do {
			System.out.println("Bye");
			num1++;
		} while (num1 <= 7);
		
		System.out.println("------------------");
		//print even numbers from 20 to 50 using do while
		
		int n=20;
		do {
	
			System.out.println(n);
			
			n+=2;
		}while (n<=50);
		
		
		
		
	}

}
