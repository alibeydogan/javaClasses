package com.class10;

public class Task {
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
		
		
		System.out.println("---------------------------");
		
		String[] names=new String[2];
		names[0]="Ali";
		names[1]="Anıl";
		System.out.println(names[1]);
		
		System.out.println("---------------------------");
		
		String[] words= {"Java ", "Saturday ", "day ", "coding ", "is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		
	}
}
