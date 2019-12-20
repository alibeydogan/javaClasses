package com.class26;

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		//Creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("----------");
		//Creating an object of child class
		Cat cat=new Cat();
		cat.eat();//printing from parent
		cat.meow();//printing from child
		cat.sleep();//printing from child
		
		
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		System.out.println("----------------------");
		
		//Non Primitive TypeCasting
		//widening -> creating an object of the child class and 
		//giving reference to the Parent Class
		Animal obj=new Cat();
		//Narrowing 
//		Cat obj2=new Animal(); --> Can not convert from animal to Cat
		obj.eat();//printing from parent
		obj.sleep();//this method comes from child class->runtime polymorphism
//		obj.meow(); compiler gives error--> method won't available
		
		
	}
}
