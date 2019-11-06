package com.class3;

public class PrimitiveCasting {
	public static void main(String[] args) {
		//FYI - For Your Information
		double d=12;
		System.out.println(d);
		//int i=12; compile time error
		
		//Casting - changing/converting one type to another
		/*
		 * Widening(Impilict/Automatic)
		 *  byte->short->int->long->float->double
		 *  
		 * Narrowing (Explict/Manual)
		 * double->float->long->int->short->byte
		 */
		
		//Widening or automatic or implicit casting
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing or emplicit or manual casting
		System.out.println("***");
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=789;
		byte b1=(byte) num3;
		System.out.println(b1);		
		

		
		
	}

}
