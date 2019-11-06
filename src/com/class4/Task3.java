package com.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner where=new Scanner(System.in);
		System.out.println("Where do you live ?");
		String city=where.nextLine();
		
		Scanner temp=new Scanner(System.in);
		System.out.println("What's the temperature?");
		int fahr=temp.nextInt();
		double cels=((fahr-32)/1.8);
		System.out.println("The temp of "+city+" is "+cels+" celcius");
				
	}

}
