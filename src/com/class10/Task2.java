package com.class10;

public class Task2 {
	public static void main(String[] args) {
		/*Create an array of countries. While retrieving all values
		 *  from an array print capital for each country.
		 */
		
		String[] country= {"Turkey", "Switzerland", "Italy", "Germany", "UK", "France"};
		
		for(int i=0; i<country.length; i++) {
			
			if(country[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(country[i].equals("Switzerland")) {
				System.out.println("Bern");
			}else if(country[i].equals("Italy")) {
				System.out.println("Rome");
			}else if(country[i].equals("Germany")) {
				System.out.println("Berlin");
			}else if(country[i].equals("UK")) {
				System.out.println("London");
			}else if(country[i].equals("France")) {
				System.out.println("Paris");
			}
			
			
		}
		
	}
}
