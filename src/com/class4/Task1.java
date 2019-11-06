package com.class4;

public class Task1 {
	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=3.8;
		
		if (diploma) {
			System.out.println("Congrulations !");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have stuided harder");
			}
		}else {
			System.out.println("Sorry you don't have a diploma");
		}
		System.out.println("-----------");
		
		double mortgage=5.5;
		int price= 50000;
		
		if (mortgage >= 4.5) {
			System.out.println("Don't buy the house");
		}else {
			System.out.println("Buy the house");
			if (price>200000) {
				System.out.println("Take loan");
				}else {
					System.out.println("Pay cash");
				}
			}	
		
	}

}
