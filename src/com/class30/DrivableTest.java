package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
//		obj.DRIVE_FAST=false; Compile gives error because interface has a final value for that reason you cannot reassign a value
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
	}

}
