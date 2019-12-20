package com.class18;

public class Task {
	
		//main method(2 int type parameters)
	void large(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("num1 is larger than num2");
		} else if (num2 > num1) {
			System.out.println("num2 is larger than num1");
		} else {
			System.out.println("They are equal");

		}
	}

	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}
	}

	void palindrome(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Task obj = new Task();
		obj.large(23, 66);
		obj.evenOdd(56);
		obj.palindrome("hey");
	}

}
