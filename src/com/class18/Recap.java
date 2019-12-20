package com.class18;

public class Recap {
	int student, teachers, classRooms;
	String name, address, website;

	void study() {
        System.out.println("Students studiyng at "+name);
    }

	void teach() {
		System.out.println("Teachers teaching at " + name);
	}

	public static void main(String[] args) {

		Recap school = new Recap();
		school.name = "Syntax";
		school.student = 200;

		Recap school1 = new Recap();
		school1.name = "Pinnacle";

		school1.teach();
		school.study();

	}

}
