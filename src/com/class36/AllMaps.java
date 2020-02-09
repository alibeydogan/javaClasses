package com.class36;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hashMap=new HashMap<>();
		hashMap.put(1, "Monday");
		hashMap.put(2, "Tuesday");
		hashMap.put(3, "Wednesday");
		hashMap.put(4, "Thursday");
		hashMap.put(5, "Friday");
		hashMap.put(8, "Friday");
		hashMap.put(null, "Saturday");
		hashMap.put(9, null);
		hashMap.put(10, "null");
		
		System.out.println(hashMap);
		
		
		Map<Integer, String> LinkedHashMap=new LinkedHashMap<>();
		LinkedHashMap.put(1, "Monday");
		LinkedHashMap.put(2, "Tuesday");
		LinkedHashMap.put(3, "Wednesday");
		LinkedHashMap.put(4, "Thursday");
		LinkedHashMap.put(5, "Friday");
		LinkedHashMap.put(8, "Friday");
		LinkedHashMap.put(null, "Saturday");
		LinkedHashMap.put(9, null);
		LinkedHashMap.put(10, "null");
		
		System.out.println(LinkedHashMap);
		
		Map<Integer, String> treeMap=new TreeMap<>();
		treeMap.put(1, "Monday");
		treeMap.put(2, "Tuesday");
		treeMap.put(3, "Wednesday");
		treeMap.put(4, "Thursday");
		treeMap.put(5, "Friday");
		treeMap.put(8, "Friday");
		//treeMap.put(null, "Saturday");
		treeMap.put(9, null);
		treeMap.put(10, "null");
		
		System.out.println(treeMap);
		
		Map<String, String> hashTable=new Hashtable<>();
		hashTable.put("1", "Monday");
		hashTable.put("8", "Friday");
		hashTable.put("2", "Tuesday");
		hashTable.put("3", "Wednesday");
		hashTable.put("4", "Thursday");
		hashTable.put("5", "Friday");
		//hashTable.put(null, "Friday");
		//hashTable.put("5", null);

		
		System.out.println(hashTable);



		
		
	}

}
