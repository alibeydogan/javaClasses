package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		
		/*ask user to enter age
		 * if age from 1 to 3-->you are a baby
		 * if age from 3-5 you are a toddler
		 * if age 5-12-->you are kid
		 * if age 12-19-->teenager
		 * if age >20-->you are an adult
		 */
		
		int age;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Enter your age");
		
		age=scan.nextInt();
		
		String human;
		
		if(age>=1 && age<3) {
			//System.out.println("You are baby");
			human="baby";
		}else if(age>=3 && age<5) {
			//System.out.println("You are toddler");
			human="toddler";
		}else if (age>=5 && age<12) {
			//System.out.println("You are kid");
			human="kid";
		}else if (age>=12 && age<19) {
			//System.out.println("You are teenager");
			human="teenager";
		}else if (age>20) {
			//System.out.println("You are an adult");
			human="adult";
		}else {
			//System.out.println("Invaild age");
			human="unknown";
		}
		System.out.println("You are "+human);

	}

}
