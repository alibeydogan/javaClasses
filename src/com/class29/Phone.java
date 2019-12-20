package com.class29;

public abstract class Phone {
	//IMPLEMENTED METHODS
	public void makeCall() {
		System.out.println("Make call");
	}
	
	public void sendText() {
		System.out.println("Send text");
	}
	//UNIMPLEMENTED METHODS
	public abstract void takePictures();
	
	public abstract void playGames();
}
//concrete class-somut sınıf
class iPhone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
	}	
}

class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on the Samsung");		
	}
	//undefined/unimplemented/abstract methods-> without body

	
}