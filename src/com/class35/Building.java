package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Building {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Facebook");
		map.put(3, "Twitter");
		map.put(4, "Instagram");
		map.put(5, "Pinterest");
		map.put(6, "Google");
		map.put(7, "Facebook");
		
		int size=map.size();
		System.out.println(size);
		
		map.replace(4, "Apple");
		System.out.println(map.get(4));
		
		map.remove(7);
		
		System.out.println(map);
		
		System.out.println("-------------------------");
		
		Map<String, String> personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value ?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and all values
		System.out.println("-----PRINTING ALL KEYS------");
		Set<String> keys=personMap.keySet();
		for(String key: keys) {
			System.out.println(key);
		}System.out.println("*****************");
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}

		System.out.println("-----PRINTING ALL VALUES------");
		Collection<String> values=personMap.values();
		
		for(String val: values) {
			System.out.println(val);
		}		System.out.println("*****************");

		
		Iterator<String> valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}	System.out.println("*****************");

		//how can i retrieve and print values key:value
		for(String key: keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		


		

	}

}
