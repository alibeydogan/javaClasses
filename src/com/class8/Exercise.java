package com.class8;

public class Exercise {

	public static void main(String[] args) {
		/*
		 * print numbers from 1-100 in 1 line with space
		 * print numbers from 100 to 1
		 * print even numbers from 20 to 1(2 ways)
		 * print odd numbers between 20 and 50(2 ways)
		 */
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		for(int i=20; i>=0; i-=2) {
			System.out.print(i+" ");
		}
		//printing odd numbers 20-50 1st way
		for(int i=20; i<=50; i++) {
			if(i%2==1)
			System.out.print(i+" ");
		}
		//2nd way of printing odd numbers 20-50
		for(int i=19; i<=50; i+=2){
			System.out.println(i);
		}
		int sum=0;
		for(int i =1; i<=5; i++) {
			sum=sum+i;
			System.out.print(sum+"+");
		}
		System.out.println("*****************");
		//what is the output
		int sumAll=0;
		
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		System.out.println("*****************");
		//what is the output
		
		int total=2;
		
		for(int y=1; y<=3; y++) {
			total=total*y;// 2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total);
		
		
		
	}

}
