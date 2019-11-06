package com.class8;

import java.util.Scanner;

public class ExerciseAgain {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
		System.out.println("####################");

		for (int a = 0; a <= 10; a++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Do yo want credit card?");
			String word = scan.nextLine();
			if (word.equalsIgnoreCase("yes")) {
				break;
			}

		}
	}

}
