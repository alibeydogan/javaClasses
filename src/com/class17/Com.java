package com.class17;

public class Com {
	// define features, attributes
	String monitor, brand, name, mouse;
	boolean keyboard;
	int size, screen, memory, ram;

	// define behavior, actions
	void playGames() { // method header
		// method body
		System.out.println("I can play on my " + name);
	}

	void javaCoding() {
		System.out.println("I can do Java coding on my " + name);
	}

	void watchMovie() {
		System.out.println("I can watch movie on my " + name);
	}
	
	///////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		//using main method for executing the codes
		
		Com com1=new Com();
		com1.brand="Apple";
		com1.name="Macbook Pro";
		com1.memory=250;
		
		System.out.println("I have "+com1.brand+" "+com1.name);
		com1.javaCoding();
		com1.watchMovie();
		
		System.out.println("---Creating 2 object of a computer type---");
		
		Com com2=new Com();
		com2.brand="Dell";
		com2.name="420";
		com2.memory=125;
		
		com2.javaCoding();
		com2.watchMovie();
		com2.playGames();
		
	}

}
