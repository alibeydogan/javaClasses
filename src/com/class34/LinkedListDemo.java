package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<>();
		//adding elements
		llist.add("Hello");//index 0
		llist.add("Bye");//index 1
		llist.add("Hello");//index 2
		llist.add("Bye");//index 3
		llist.add(2, "How are you?");//index 4
		System.out.println(llist);
		
		//replace 1 element
		llist.set(1, "Good Bye");
		System.out.println(llist);
		
		//retrieve 1 element(geri almak)
		String element=llist.get(2);
		System.out.println(element);
		
		//retrieve all elements
		System.out.println("--------- 1st way");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println("--------- 2nd way");
		for(String el: llist) {
			System.out.println(el);
		}
		
		System.out.println("--------- 3th way");
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
