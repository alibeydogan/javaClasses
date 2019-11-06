package com.class13;

public class StringManipulation1 {

	public static void main(String[] args) {
		
		String str="Java is getting interesting";
		
		System.out.println(str.substring(11));
		System.out.println(str.substring(8, 15));
		
		System.out.println("---------------------------------");
		
		/*
		 * Print Sunday  reverse* yadnuS
		 */
		String a="Sunday";
		String day="Sunday";
		//System.out.println(day.charAt(5)+" "+day.charAt(4)+" "+day.charAt(3)+" "+day.charAt(2)+" "+day.charAt(1));
					
				
		for (int i = day.length()-1; i >=0; i--) {
			System.out.print(day.charAt(i));
			
		}
	
		/*
		 * Create a String and if the string is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the string
		 */
		
		String str1="Hellourwewr";
		
		int middle=str1.length()/2;
		System.out.println();
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0 && str1.length()>=3) {
				System.out.println(str1.charAt(middle));
				
				
				
			}
		}
		
	
	
	
	
	
	
	
	}
	

}
