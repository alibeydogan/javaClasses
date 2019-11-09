package com.class15;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
		
		//lets ask user to enter browser
		//based on the input we say "Your selected browser is "___
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your browser name");
		String browser=scan.nextLine();
		String finbro=browser.toLowerCase();
		
		switch(browser.toLowerCase()) {
		case "firefox":
			System.out.println("Execution be performed on "+browser);
			break;
		case "chrome":
			System.out.println("Execution be performed on "+finbro);
			break;
		case "safari":
			System.out.println("Execution be performed on "+browser);
			break;
			default:
				System.out.println("Please enter valid browser");
		}
	}

}
