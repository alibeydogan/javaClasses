package com.class3;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("**************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b5=d>d1;
		System.out.println(b5);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		System.out.println("##############");
		
		int a=90;
		int b=300;
		//if number a is bigger than number b
		//I want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
		}
		
		int expectedHours=15;
		int actualHours=20;
		//if expected hours are more than actual -> you will succeed
		//otherwise, please study more
		
		if(actualHours>expectedHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please, study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=5.99;
		//teaPrice-=2; //4.99-2=2.99
		//if price is more than afford i won't buy
		//if price il less or matches what i can afford then i will buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And i will enjoy my tea");
		}else {
			System.out.println("I can't afford, I need to study more");
			System.out.println("I will go back to study more");
		}
		
	        System.out.println("I keep writing some code");
	        System.out.println("I keep writing more code");
		
	    		
		
		
		
	}

}
