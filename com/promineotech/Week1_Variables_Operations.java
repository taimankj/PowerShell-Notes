package com.promineotech;

public class Week1_Variables_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a double variable called circleRadius and set it to 2.5
		 * declare a constant of type double named numPI equal to 3.14159
		 * declare a variable called circleArea
		 * Set circleArea equal to an equation that will calculate the area of a circle using numPI and the circleRadius parameter
		 * 
		 * Equation of a circle is pi * r * r
		 * Where pi is numPI and r is circleRadius
		 */
		//WRITE YOUR CODE HERE
		double circleRadius = 2.5;
		final double numPI = 3.14159;
		double circleArea = numPI * circleRadius * circleRadius;
		System.out.println(circleArea);
		
		//swapping variables
		
		int x = 101;
		int y = 202;
		System.out.println("x is " + x + " and y is " + y + ".");
		
		int z = x;
		x = y;
		y = z;
		System.out.println("x is now " + x + " and y is now " + y + ".");
		
		
		//Debugging
		/*
		 * The following program declares a final constant variable and then attempts to modify its value.
		 * However, doing so results in an error.
		 * Your task is to debug the program so that it prints the MAX_VALUE of 10 and a NEW_MAX_VALUE of 20 to the console. 
		 * Uncomment the following code and alter lines 47, 48 , and  to make it work.
		 */
		
			
		final int MAX_VALUE = 10;
		System.out.println(MAX_VALUE);
		
		final int NEW_MAX_VALUE = 20;
		System.out.println(NEW_MAX_VALUE);
		
	}

}