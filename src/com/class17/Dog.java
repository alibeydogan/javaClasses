package com.class17;

public class Dog {
	
	String name, breed, color;
	int age;
	boolean friendly;
	
	void run(){
		System.out.println(name+" can run too fast");
	}
	void play() {
		if(friendly) {
			System.out.println(name+" can play with you");
		}else {
			System.out.println(name+" can bite you");
		}
		
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.name="Barney";
		dog1.breed="Husky";
		dog1.color="Brown";
		dog1.age=4;
		dog1.friendly=true;
		
		dog1.run();
		dog1.play();
		dog1.bark();
		
		Dog dog2=new Dog();
		dog2.name="Kara";
		dog2.breed="Bulldog";
		dog2.color="Black";
		dog2.age=6;
		dog2.friendly=false;

		
		dog2.run();
		dog2.play();
		dog2.bark();
		
		Dog dog3=new Dog();
		dog3.name="Sia";
		dog3.breed="Labrador";
		dog3.color="White";
		dog3.age=9;
		dog3.friendly=true;

		
		dog3.run();
		dog3.play();
		dog3.bark();
		
	}

}
