package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=3; i++) {
			System.out.println("I am outter loop");
			
			for(int j=1; j<=3; j++) {
				System.out.println("I am inner loop");
			}
			
		}
	}

}
