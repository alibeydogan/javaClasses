package com.class2;

public class Variables {
	public static void main(String[] args) {
		
		String studentsName="Ali";
		String studentLastName="Beydogan";
		char studentGrade='B';
		String studentCity="Voorhees";
		String studentState="NJ";
		String studentPhoneNumber="(545)232-3232";
		
		//String studentCity="Washington DC" we do not
		//need to declare variable again
		studentCity="Washington DC";
		studentState="DC";
		studentPhoneNumber="(123)456-7890";
		studentGrade='A';
		
		System.out.println(studentCity);
		System.out.println(studentState);
		System.out.println(studentPhoneNumber);
		System.out.println(studentGrade);
		
		//My name is__
		//I live in city of__
		//My phone number is__
		
		String text1="My name is ";
		String text2="I live in city of ";
		String text3="My phone number is ";
		
		System.out.println(text1+studentsName);
		System.out.println(text2+studentCity);
		System.out.println(text3+studentPhoneNumber);
		
		
	}
	

}
