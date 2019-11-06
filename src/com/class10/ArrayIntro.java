package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int a1=10;
		
		//1st way
		int [] b; //declare an array--> preffered way
		int c[];
		b=new int[4];//initialize an array
		
		//2nd way -->all in 1 line(declaration & initialization
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access value from an array
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		
		//Today we have Java Class
		System.out.println("Today we have "+classes[0]+" class");
		
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		//how can i change 1 to 100	
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		//
		
		String[] names=new String[3];
		names[0]="Ali";
		names[1]="Anil";
		names[2]="Talha";
		//names[3]="Jaime"; during run time we will get an exception
		//ArrayIndexOutOfBoundsException Error
		
		//System.out.println(names[3]);
		
		//we are putting less elements inside
		//-->compiler will give default values
		double [] numbers=new double[4];
		numbers[1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[2]);
		System.out.println(numbers[0]);
		/* THE SIZE OF AN ARRAY IS FIXED
		 * if we store more values than the actual size on array
		 * -->
		 * we will get runtime exception
		 * -->
		 * 
		 * 		
		 */
	

	}

}
