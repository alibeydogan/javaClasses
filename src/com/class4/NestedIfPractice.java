package com.class4;

public class NestedIfPractice {
	public static void main(String[] args) {
		boolean isFriday = false;
		int day = 13;
		// if today is friday only day I want to if it day is 13

		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("I will watch comedy movie");
			}
			
		} else {
			System.out.println("Today is NOT Friday");
		}
	}
}
