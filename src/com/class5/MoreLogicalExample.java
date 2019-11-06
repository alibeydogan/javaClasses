package com.class5;
//to import shortcut is command+shift+o
import java.util.Scanner;

public class MoreLogicalExample {

	public static void main(String[] args) {
		/*
		 * ask user to enter daily sales
		 * based on the sales range want to give commission
		 * to the person
		 * if sales <100 -->commisson 10%
		 * if sales 100-200 -->commisson 20%
		 * etc...
		 */
		Scanner scan;
		double salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount>=1 && salesAmount<100) {
			commission=salesAmount*0.1;
		}else if (salesAmount>=100 && salesAmount<200) {
			commission=salesAmount*0.2;
		}else if (salesAmount >=200 && salesAmount<500) {
			commission=salesAmount*0.3;
		}else if (salesAmount>=500) {
			commission=salesAmount*0.5;
		}else {
			commission=0;
		}
		
		System.out.println("Based on your sales your commission is "+commission);
		
		
	}

}
