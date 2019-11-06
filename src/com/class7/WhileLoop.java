package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
	
		int time = 8;
		
		if (time<12) {
			System.out.println("AAAAA");
	}
	System.out.println("--------------------");
	while (time < 12 ) {
		System.out.println("BBBBB");
		time++;
	}
	int i=-1;
	
	while (i<4) {
		System.out.println("CCCCCC");
		i++;
	}
	System.out.println("Outside of the loop");
	}

}
