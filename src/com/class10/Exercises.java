package com.class10;

public class Exercises {
	public static void main(String[] args) {
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		int a=2;
		System.out.println(grades[1]);
		System.out.println(grades[a]);
		
		a+=2;
		System.out.println(grades[a]);
		a--;
		System.out.println(grades[a]);
		
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades);
		System.out.println("---------------------------");
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("---------------------------");
		
		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
		System.out.println();
		//create an array to store 5 double values, print all element in 1 line
		
		double [] num= {23.0, 3.5, 7.7, 10.1};
		//int size1=num.length;
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"-");
		}
		
		
	}

}
