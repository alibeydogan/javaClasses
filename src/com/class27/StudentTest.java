package com.class27;

public class StudentTest {
	
	public static void main(String[] args) {
		SyntaxStudent ss=new SyntaxStudent();
		ss.study();
		ss.attendClasses();
		ss.research();
//		ss.doHomework();ce: not visible since method inside parent is private
		
		Student student=new SyntaxStudent();
		student.study();
		student.research();
		student.attendClasses();
//		student.doHomework();ce: not visible since method inside parent is private
		
	}

}
