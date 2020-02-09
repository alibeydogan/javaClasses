package com.class35;

import java.util.HashMap;

public class MapIntro {
	// Map-interface that is not a part of Collection Framework
	// Map will have its own unique methods to manipulate with Data
	// Inside the map we store 2 objects Key+Values-->Entry
	// Map is a collection of Entry Objects
	/*
	 * Classes that implements that implements Map Interface HashMap TreeMap
	 * LinkedHashMap HashTable
	 */

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		//to store key+value pair into map
		map.put(101,  "John");
		map.put(102,  "Jack");
		map.put(103,  "Jane");
		map.put(104,  "Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
		//I want to add more entry objects
		//map.put("105", "John");---> CE: key and value type must be matched
		//adding duplicate values --> OK
		map.put(105, "John");
		System.out.println(map);
		//Adding duplicate keys--> Override, we cannot have duplicate keys
		map.put(102, "Hasan");
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		
		//to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		
		//how to remove an object from a map
		map.remove(101);
		System.out.println(map);
		
		//how to verify if certain key is exist
		boolean flag1=map.containsKey(200);
		System.out.println(flag1);
		if(flag1) {
			map.replace(200, "Seval");
		}else {
			map.put(200, "Seval");
		}
		
		//how to verify if certain value is exist
		boolean contains=map.containsValue("Seval");
		System.out.println(contains);
		System.out.println(map);

	}
}
