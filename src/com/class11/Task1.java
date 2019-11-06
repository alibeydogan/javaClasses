package com.class11;

import com.class8.ForLoop;

public class Task1 {
	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		String[] array = { "bmw", "mercedes", "audi", "toyota", "honda", "dodge" };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("------------------");

		for (String names : array) {
			System.out.println(names);
		}
		System.out.println("----------------");

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */
		int[] nums = { 1, 3, 9, 12 };
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];

		}
		System.out.println(sum);
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */
		
		String[] countries= {"India", "Canada", "USA"};
		
		for(String getCountry : countries) {
			if(getCountry.equals("USA")) {
				System.out.println("The capital of USA is Washington DC");
			}
		}
		

	}
	}


