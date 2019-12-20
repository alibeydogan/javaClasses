package com.class21;

public class Employee {
	String eID;
	int salary;
	static String CEO;
	
	void sentence() {
		System.out.println("Employee: "+eID+" Salary: "+salary+" CEO: "+CEO);
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		
		emp1.eID="Ali";
		emp1.salary=5000;
		Employee.CEO="Sumair";
		
		Employee emp2=new Employee();
		emp2.eID="Veli";
		emp2.salary=5000;
		
		emp1.sentence();
		emp2.sentence();
	}

}
