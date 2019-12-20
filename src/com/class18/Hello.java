package com.class18;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello " + name);

	}

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Ali");
		obj.sayHello("Anıl");
		obj.sayHelloDifferentLanguage("Paraguay");
		obj.sayHelloDifferentLanguage("Albania");
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("paraguay");
		// obj.sayHelloDifferentLanguage(123); --> you will get compile time error

		obj.sayNameAndAge("Jack", 45);
		obj.isSnowing(false);
		obj.isSnowing(true);

	}
	/*
	 * create a method that will say hello in different language based on the value
	 * that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguage(String country) {

		switch (country.toLowerCase()) {

		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "paraguay":
			System.out.println("Hola");
			break;
		case "albania":
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("I do not know how to say Hello in your language");

		}
	}

	// method to say name and age
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is " + name + " and I am " + age + " years old");
	}
	// create a method that will check if it snowing
	// if snow--> stay at home, otherwise go for a walk

	void isSnowing(boolean isSnowing) {

		if (isSnowing) {
			System.out.println("Stay home");
		} else {
			System.out.println("Go for a walk");
		}

	}

}
