package com.class17;

public class Phone {

	String name, model, color;
	int memory, ram;
	boolean smart;

	void calling() {
		// System.out.println("I am calling method");
		System.out.println(name + " can call you");
	}

	void internet() {
		// System.out.println("I am internet method");
		if (smart) {
			System.out.println(name + " can surf the internet");
		} else {
			System.out.println(name + " can not surf the internet");
		}

	}

	void photo() {
		// System.out.println("I am photo method");
		System.out.println(name + " can take your photo");
	}

	public static void main(String[] args) {
		Phone tel1 = new Phone();
		tel1.name = "iPhone";
		tel1.model = "11 Pro Max";
		tel1.color = "Midnight Green";
		tel1.memory = 512;
		tel1.ram = 4;
		tel1.smart = true;

		tel1.calling();
		tel1.internet();
		tel1.photo();

		Phone tel2 = new Phone();
		tel2.name = "Android";
		tel2.model = "Xiaomi Mi 9";
		tel2.color = "Black";
		tel2.memory = 512;
		tel2.ram = 12;
		tel2.smart = true;

		tel2.calling();
		tel2.internet();
		tel2.photo();

		Phone tel3 = new Phone();
		tel3.name = "Nokia";
		tel3.model = "3310";
		tel3.color = "Blue";
		tel3.memory = 1;
		tel3.ram = 1;
		tel3.smart = false;

		tel3.calling();
		tel3.internet();
		tel3.photo();

	}

}
