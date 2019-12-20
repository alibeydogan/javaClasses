package com.class21;

public class TaskStudents {
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	void print() {
		System.out.println("Student name: "+studentName+", Student ID: "+studentID+", Number of students: "+numberOfStudents);
	}

	public static void main(String[] args) {
		TaskStudents s1=new TaskStudents();
		s1.studentName="Ali";
		s1.studentID=1408;
		TaskStudents.numberOfStudents++;
		s1.print();
		
		s1.studentName="Veli";
		s1.studentID=1117;
		TaskStudents.numberOfStudents++;
		s1.print();
		
		s1.studentName="John";
		s1.studentID=1245;
		TaskStudents.numberOfStudents++;
		s1.print();
		
		
	}
}
