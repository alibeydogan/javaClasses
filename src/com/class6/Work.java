package com.class6;

import java.util.Scanner;

public class Work {
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Do you need loan?");
	    boolean input=scan.nextBoolean();
	    
	    if (true){
	      System.out.println("What is your credit score?");
	      int credit=scan.nextInt();
	      if (credit<600){
	        System.out.println("Not eligible");
	      }if (credit>600 && credit<=700){
	      System.out.println("Maybe eligible");
	      }if (credit>701 && credit<=800){
	        System.out.println("Eligible");
	      }if (credit>800){
	        
	      System.out.println("Definitely eligible");
	      }
	    }else{
	      System.out.println("Unknown");
	    }
	  }


	
}
