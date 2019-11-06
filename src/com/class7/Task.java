package com.class7;

public class Task {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true create int variable day and
		 * assign it to 1 as long as as it is workdDay print "i need a day off" and
		 * increase day once day is 6 print " i dont need a day off anymore"
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			
			if (day == 6) {
				System.out.println("I dont need a day off anymore");
				workDay = false; //break;
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}

	}

}
