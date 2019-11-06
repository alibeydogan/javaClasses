package com.class4;

import java.util.Scanner;

public class NewTask2 {

	public static void main(String[] args) {
		Scanner dmv=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=dmv.nextInt();
		if (age<18) {
			System.out.println("You can get a driver license");
		}else {
			System.out.println("You have to get a learners permit");
			
		}

	}

}
