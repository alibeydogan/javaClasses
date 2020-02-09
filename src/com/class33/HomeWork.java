package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {
	public static void main(String[] args) {
		
			List<String> cars = new ArrayList<>();
			cars.add("Nissan");
			cars.add("Toyota");
			cars.add("Honda");
			cars.add("BMW");
			
			//1st way
			for(String name : cars) {
				System.out.println(name);
			}
			System.out.println("------");

			
			//2nd way
			int size=cars.size();
			
			for(int i=0; i<size; i++) {
				System.out.println(cars.get(i));
			}
			System.out.println("------");
			
			
			//3th way
			Iterator<String> it=cars.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			

		

	}

}
