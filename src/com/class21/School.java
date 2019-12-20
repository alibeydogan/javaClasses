package com.class21;

public class School {
	public static void main(String[] args) {
		Student student0 = new Student();
		
		Student student1 = new Student();
		// assigning instance variables
		student1.studentName = "Eric";
		student1.GPA = 3.95;
		Student.school = "Syntax";

		
		
		
		Student student2 = new Student();
		student2.studentName = "Jaime";
		student2.GPA = 3.90;
		Student.school = "Syntax Technologies";

		student1.displayInfo();
		student2.displayInfo();

		
		int hours = 3;
		hours=4;
		student1.study(hours);
		

	}

}
