package com.class27;

public class Student {
	public void study() {
		System.out.println("Student needs to study");
	}
	
	private void doHomework() {
		System.out.println("Student needs to do homework");
	}
	
	protected void research() {
		System.out.println("Student needs to do research");
	}
	
	void attendClasses() {
		System.out.println("Student needs to do attend classes");
	}

}

class SyntaxStudent extends Student{
	
	//@Override -- we are not overriding, child class has its own method doHomework();
	private void doHomework() {
		System.out.println("Student needs to do homework");
	}
	@Override
	public void study() {
		System.out.println("Syntax Student need to study a lot");
	}
	//When overriding we CANNOT reduce a visibility of a method
	//public--> protected --> default --> private
	@Override
	protected void research() {
		System.out.println("Syntax Student needs to do research");
	}
	@Override
	protected void attendClasses() {
		System.out.println("Syntax Student needs to do attend ALL classes");
	}
}
