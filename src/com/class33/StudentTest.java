package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	
	public void display() {
		System.out.println("My name is "+name+" and my student id is "+studentId);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//create an arraylist that will store student type of objects
		
		List<Student> students=new ArrayList<>();
		//creating Student type of objects
		Student stu=new Student("John", 101);
		Student stu1=new Student("Jane", 102);
		Student stu2=new Student("Jack", 103);
		
		//adding Student type of objects		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		System.out.println("***");
		//display info of each student
		stu.display();
		System.out.println(stu.name);
		System.out.println(stu.studentId);
		stu1.display();
		//for each
		for(Student student:students) {
			student.display();
		}
		//adding more objects of a student type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Jamie", 106));
		System.out.println("-----");
		
		//display info of each student
		Iterator<Student> myIterator=students.iterator();
		while(myIterator.hasNext()) {
			//myIterator.next().display();
			Student obj=myIterator.next();
			obj.display();
		}
		
		
	}

}
