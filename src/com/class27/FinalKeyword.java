package com.class27;

public final class FinalKeyword {
	
	public final String str="Hello";
	
	public static void main(String[] args) {
		
		String str="I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String finalString="Java is easy";
//		finalString="Java is hard"; -> cannot modify final variable
		
		
		final int age=120;
//		age=100;
		
		
		FinalKeyword obj=new FinalKeyword();
		System.out.println(obj.str);
	}

	public final void hello() {
		System.out.println("I am a final method in Parent Class");	
	}
	public final void hello(int num) {
		System.out.println("I am a final method in Parent Class");	
	}
	//can we overload a final method
}
//class FinalKeywordChild extends FinalKeyword{
//	*final methods cannot be overriden, we will get Compile error
//	public final void hello() {
//		System.out.println();
//	}
//	
//}