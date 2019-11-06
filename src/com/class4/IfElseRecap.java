package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		/*
		 * Class schedule if tuesday---> sdlc if wed---> java review if thur---> sdlc if
		 * saturday---> java coding if sunday ---> my favorite java coding
		 */

		int day;
		day = 1;

		if (day == 2) {
			System.out.println("SDLC Class");
		} else if (day == 3) {
			System.out.println("Review Class");
		} else if (day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6) {
			System.out.println("Java Class");
		} else if (day == 7) {
			System.out.println("Favorite Java Class");
		} else {
			System.out.println("There is no class at school");
		}

	}

}
