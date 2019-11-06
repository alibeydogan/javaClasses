package com.class8;

import java.util.Scanner;

public class Egzersiz {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=10) {
			if(i==5 && i==7 && i==8 && i==9) {
				continue;
				
			}
			System.out.println(i);
			i++;
			
		}
		
		
	}
}