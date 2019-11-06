package com.class11;

public class Recap {
	public static void main(String[] args) {
		int num1=12;
		int num2=3;
		int num3=56;
		
		int num4=13, num5=15, num6=12;
		//int a=12, int b=14, int c=22;
		//Array Declaration;
		int [] h=new int [3];
		
		int e[];
		int y[];
		y=new int[3];
		//u=new int [2]; will not compile
		//u=12;
		
		int [] array= new int [6];
		int [] arr= {2,3,5,7};
		//       1     2,5      
		for(int s=0; s< arr.length; s++) {
			System.out.println(arr[s]);
		}
		//shortcut= type for+kntrl+space+enter
		System.out.println("---------------");
		for(int ar:arr) {
			System.out.println(ar);
		}
		
		
	}

}
