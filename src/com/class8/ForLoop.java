package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		//Say good morning 5 times
		//initialize    test condition     incremenet
		
		for(int i=0;          i<=4;          i++) {
			System.out.println("Good Morning");
			
		}
		
		//print numbers from 1-10;
		for (int i=1; i<=10; i++) {
		System.out.println(i);	
	}
	
		//print number from 10-1
	
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}
	
	for (int i=0; i<=50; i+=5) {
		System.out.println(i); //5, 10, 15, 20
		
	}
  }
}
