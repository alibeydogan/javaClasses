package com.class6;

import java.util.Scanner;

public class Work123 {
	public static void main(String[] args){
		   Scanner scan=new Scanner(System.in);
		   String name, name1;
		   System.out.println("Sen kimsin ?");
		   name=scan.nextLine();
		   
		   if (name.equals("Ali")) {
			   System.out.println("Kimi seviyorsun ?"); 
			   name1=scan.nextLine();
			   if (name1.equals("Anılı")) {
				   System.out.println("Anıl da seni çokkkkkk seviyor !!!");
			   }
		   }else {
			   System.out.println("Ali seni çooooook seviyor !!!");
		   }
		   
		  
		 }
}