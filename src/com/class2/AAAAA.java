package com.class2;

import java.util.Scanner;

public class AAAAA {

	  public static void main(String[] args){
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Do you need loan?");
		  boolean inp=scan.hasNextBoolean();
		  
		  if(inp==true) {
			  System.out.println("What's your credit score?");
			  int score=scan.nextInt();
			  if(score<600) {
				  System.out.println("Not eligible");
			  }else if(score>=600 && score<700) {
				  System.out.println("Maybe eligible");
			  }else if(score>=700 && score<800){
				  System.out.println("Eligible");
			  }else if(score>800) {
				  System.out.println("Definitely eligible");
			  }
			  
			  
			  
			  
		  }else {
			  System.out.println("Unknown");
		  }
		 
		}
}