package com.class2;

public class Work {
	public static void main(String[] args) {
		
		double num1, num2, sub, mult, div, squ;		
		num1=3.9;
		num2=3.4;
		
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		
		System.out.println("The multiplication of 2 numbers "+num1+" and " +num2+ " is equal to "+mult);
		System.out.println("The subtraction of 2 numbers "+num1+" and " +num2+ " is equal to "+sub);
		System.out.println("The division of 2 numbers "+num1+" and " +num2+ " is equal to " +div);
		
		squ=num1*num1;
		System.out.println("The squre of the "+num1+" is "+squ);
		
		long width, height, perimeter, area;
		width=5;
		height=8;
		perimeter=(2*width)+(2*height);
		area=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
		String message="The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area;
		System.out.println(message);
		
		
		
		
		
		
		
		
	
		
				
	}

}
