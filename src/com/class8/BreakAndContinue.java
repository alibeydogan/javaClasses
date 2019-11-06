package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		
		for(int i=0; i<10; i++) {
			if(i==7) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("I am outside of the loop");
		
		//continue - it will skip current iteration
		
		for(int i=1; i<=5; i++) {
			
			if (i==3 || i==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop2323");
		
		// i want to print nums from 1 to 20 except 5,6,7
		
		for(int i=1; i<=20; i++) {
			if(i==5 || i==6 || i==7)
				continue;
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");

		
		

	}

}
