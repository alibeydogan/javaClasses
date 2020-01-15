package com.class30;

public class VehicleTest {
	
	public static void main(String[] args) {
		BMW bmw=new BMW("67674634kmmk", "Sedan", "BMW", "X5");
		BMW.displayTotal();
		//Vehicle.displayTotal();
		bmw.drive();//come from vehicle class
		bmw.stop();
		bmw.speed();
		bmw.start();
		bmw.breaking(); //come from car class
		bmw.display(); // come from bmw class
		
		
		Car car =new BMW("67674634kmmk", "Sedan", "BMW", "X5");
		
		car.drive();//come from vehicle class
		car.stop();
		car.speed();
		car.start();				
		car.breaking(); 
//		car.display(); //come from bmw class wont be avaialble to parent
		
		Vehicle vehicle=new BMW("67674634kmmk", "Sedan", "BMW", "X5");
		
		vehicle.drive();//comes from vehicle class
		vehicle.stop();
		vehicle.speed();
		vehicle.start();
//		vehicle.breaking(); //come from car class - wont be available to the parent
//		vehicle.display(); // come from bmw class - wont be available to the grandparent
		
		new BMW("3P4WEKMF", "TRUCK", "TESLA", "CYBER");
		new BMW("239OPEXSD", "Sedan", "BMW", "330");
		new BMW("M34CP", "SUV", "BMW", "X5");
		System.out.println("-----------");
		BMW.displayTotal();
		
	}

}
