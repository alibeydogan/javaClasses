package com.class10;

public class TaskAnotherWay {
	public static void main(String[] args) {
		
		String[] country= {"Turkey", "Switzerland", "Italy", "Germany", "UK", "France"};
		
		for(int i=0; i<country.length; i++) {
			switch(country[i]) {
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Switzerland":
				System.out.println("Bern");
				break;
			case "Italy":
				System.out.println("Rome");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;	
			case "UK":
					System.out.println("London");
					break;
			case "France":
					System.out.println("Paris");
					break;
			
			}
		}
	}

}
