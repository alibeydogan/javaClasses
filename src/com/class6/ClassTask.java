package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*
		 * ask user to enter the month they were born based on the month define the
		 * season if user is born in jan feb dec -winter if march april may - spring if
		 * jun jul aug - summer if sep oct nov- fall otherwise - unknown output- you
		 * were born in___
		 */
		String month = null;

		Scanner scan = new Scanner(System.in);
		System.out.println("Month of born");
		month = scan.nextLine();
		
		String season;

		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("Jule") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else {
			season = "Unknown";
		}
		System.out.println("You were born in " + season);
		System.out.println(month);

	}

}
