package com.class6;

import java.util.Scanner;

public class Work132 {
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    int num=scan.nextInt();
	    
	    if (num%2==0) {
	    	System.out.println("Value is even");
	    	
	    	if (num<100) {
	    		System.out.println("Value is just right");
	    	}else {
	    		System.out.println("Value is too large");
	    	}
	    	
	    }else {
	    	System.out.println("Value is odd");
	    }
	

	
	
	}}