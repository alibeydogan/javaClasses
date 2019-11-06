package com.class3;

public class ShorthandOperators {
	
	public static void main(String[] args) {
		
		int num=1000;
		num=num+1000;
		System.out.println(num);
		
		int num2=10;
		num2=num2-5;
		System.out.println(num2);
		
		int num3=1000;
		num3+=1000; //num3=num3+1000;
		//shortcut for printing syso+kntrl+space
		System.out.println(num3);
		
		int num4=50;
		num4+=20;
		System.out.println(num4);
		
		num4-=30; //num4=70-30
		System.out.println(num4);
		
		num4/=10; //num4=40/10
		System.out.println(num4);
		
		num4%=2; num4=4%2;
		System.out.println(num4);
		
		int numx=100;
		numx+=100;
		System.out.println(numx);
		
		numx-=67;
		System.out.println(numx);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		cakePiece=25;
		cakePiece%=7;
		System.out.println(cakePiece);
		

	}

}
