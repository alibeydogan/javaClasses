package com.class9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the start and end point");
		int a=scan.nextInt();
		int z=scan.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		
		for(int i=a; i<=z; i++) {
			if(i%2==0) {
				sumEven = sumEven + i;
			}else {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("Sum of even numbers for given range is "+sumEven);
		System.out.println("Sum of odd numbers for given range is "+sumOdd);
		System.out.println("-----------------------");
		
		do {
			System.out.println("Please guess the number(1-20)");
			int i=scan.nextInt();
			
			if(i==7) {
				System.out.println("Congrulations ! ");
				break;
			}else if(i<7){
				System.out.println("Number is too small");
			}else if(i>7) {
				System.out.println("Number is too large");
			}
		}while(true);
	}

}
