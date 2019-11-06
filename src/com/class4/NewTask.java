package com.class4;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("What is the amount of loan you needed?");
		int amount=keyboard.nextInt();
		if (amount<200000) {
			System.out.println("Accepted");
		}else {
			System.out.println("Rejected");
		}

	}

}
