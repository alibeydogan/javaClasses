package com.class34;

import java.util.*;

class Sweets{
	
	String name;
	
	public Sweets(String name) {
		this.name=name;
	}
	
	public void iLove() {
		System.out.println("I love "+name);
	}
}
public class LinkedListDemo2 {
	
	public static void main(String[] args) {
	//create a list of Sweet Objects
		LinkedList<Sweets> sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));//0
		sweetList.add(new Sweets("Cake"));//1
		sweetList.add(new Sweets("Cookies"));//2
		sweetList.add(new Sweets("Macaroons"));
		
		//lets display name of each sweet object
		for(Sweets element : sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//retrieving 1 element and accessing method (2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		
		//retrieving 1 element and accessing method (2 steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		String str="Hello 123 ";
		//"Hello 123 "--> "Hello 456 "-->"Hello 456"(trim)
		str.replace("123", "456").trim();
		System.out.println(str);
		
		Integer num=100;
					//100--> "100" ----> "200" -----------> 3  
		int newNumber=num.toString().replace("100", "200").length();
		System.out.println(newNumber);
		/*
		 * ArrayList vs LinkedList
		 * 1.AL is dynamic array while LL used doubly LL
		 * 2.AL is the best option for retrieving 
		 * 
		 * while LL is the best choice for Adding and removing
		 */
		
		/*
		 * ArrayList vs Array
		 * 1.Array is fixed in size--> static array while
		 * AL is dynamic array!
		 * 2.Array contains primitives and non primitives,
		 * while AL contains only objects (with the help of wrapper classes
		 * we are able to store numeric, boolean and char type of values
		 * 3.How many elements
		 * ArrayList.size();
		 * name of the array.length();
		 * 
		 * List Interface--is ordered collection that allows duplicates
		 */
	}
}
