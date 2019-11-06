package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * You need to ask user to pay for coffee
		 * you need to keep asking user to pay for it until
		 * entered price is equal to =5 dollars;
		 * After user paid then say "Enjoy your coffee!"
		 */
		
		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
			
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
			
		}while(price!=5);
		System.out.println("Enjoy your coffee");
		
		//2way with while
		int price1;
		System.out.println("Please pat fo ypur coffee");
		price1=scan.nextInt();
		
		while(price1!=5){
			System.out.println("Please pay for your coffee");
			
		}
		System.out.println("Enjoy your coffee");
	}

}
