package com.class29;

public class VehicleTest {
	
	public static void main(String[] args) {
		Car car = new BMW();
		car.drive();
		car.stop();
		car.start();
		car.speed();
		car.breaking();
		
		System.out.println("-------");
		
		Vehicle vehicle = new BMW();
		vehicle.drive();
		vehicle.stop();
		vehicle.start();
		vehicle.speed();
//		vehicle.braking();
		
/*		 
 * ABSTRACT METHOD CANNOT BE PRIVATE, FINAL, STATIC METHOD
 * ABSTRACT METHOD CAN BE DEFAULT, PROTECTED
 * CAN AN ABSTRACT CLASS HAS A CONSTRUCTOR ??? FIND THIS. YES
 * CAN AN ABSTRACT CLASS HAS A STATIC & NON STATIC VARIABLES??? FIND THIS
 * AN ABS

 */
		
		
		

	}
}
