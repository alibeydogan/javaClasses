package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		
		String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		//i want to print all values from an array
		//when value is Dog-> I love Dogs
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i].equals("Dog")) {
				System.out.println("I love Dogs");
			}else{
			System.out.println(animals[i]);
		}
		}	
	}

}
