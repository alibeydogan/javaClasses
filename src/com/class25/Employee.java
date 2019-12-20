package com.class25;

public class Employee {

	public static String companyName;// accessible through the project
	int salary; //accessible within 
	protected int employeeId;
	private String employeeSsn;//accesible

	void work() {
		System.out.println("I work in " + companyName + " company");
	}

	protected void getPaid() {
		System.out.println("I get paid " + salary);
	}
}