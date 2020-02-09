package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {

		// Lets create an ArrayList to store numbers
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);//index=3, size=4
		
		int size=numbers.size();
		System.out.println(size);//4
		//add more
		numbers.add(10000);
		//remove
		System.out.println("-");
		numbers.remove(size-1);
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve value from an arrayList
		int element=numbers.get(0);
		System.out.println(element);
		System.out.println("-");
		
		//1. for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-");
		
		//2. advanced loop
		
		for(Integer num:numbers) {
			System.out.println(num);
		}System.out.println("-");
		
		// i want to get values backward
		for(int i=numbers.size()-1; i>=0; i--) {
			System.out.println(numbers.get(i));
		}
		// i want to get values backward with advanced loop
		//IT IS NOT POSSIBLE
		
		//Iterator is an interface that helps to iterate
		//through collections//through each element inside the collection(list, set, queue)
		/*
		* Iterator we have 3 methods :
		* hasNext(); --> returns boolean if there is a next
		* next();--> returns that next element
		* remove();--> removes that next element
		*/
		//each collection will have an access to the iterator method 
		//that will be returning 1 object of iterator type
			System.out.println("---");
		
		//3TH WAY using iterator
		Iterator<Integer>iterator=numbers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
