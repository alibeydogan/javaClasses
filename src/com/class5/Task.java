package com.class5;

public class Task {

	public static void main(String[] args) {
		
		int day=5;
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day>5 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("###################");
		
		int h=7;
		if (h<5) {
			System.out.println("short");
		}else if (h>=5 && h<6) {
			System.out.println("medium");
		}else {
			System.out.println("6 feet and over");
		}
	}

}
