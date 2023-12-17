package com.promineotech_labs;

import LabClasses.*;
import LabInterfaces.*;

public class Week5_MathOpsLab {
	
	public static void main(String[] args) {
		/*
		 *  MathOperation Interface:
		 *  
		 *
		 *		1. Create an Interface called MathOperation with a method called evaluate that
		 * 			takes two doubles and returns a double.
		 *
		 * 		2. Create four implementing classes:
		 *					a. AdditionOperation
		 *					b. SubtractionOperation
		 * 					c. MultiplicationOperation
		 *					d. DivisionOperation
		 *
		 * 		3. Create a method that takes a MathOperation and two doubles as parameters 
		 *					and returns the result of calling the evaluate method on 
		 *					the MathOperation with the two doubles
		 *
		 *		4. Test your code
		 *
		 */
		System.out.println("-------------------------");
		System.out.println("Week 05 Interface Lab\n      Math Operations: ");
		
		System.out.println("-------------------------");
		System.out.println("Question 1: Create Interface");
		System.out.println("-------------------------");
		System.out.println("Question 2: Create Implementing Classes");
		/*
		 * Instantiate your implementing classes here
		 */
		MathOperation add = new AdditionOperation();
		MathOperation subtract = new SubtractionOperation();
		MathOperation multiply = new MultiplicationOperation();
		MathOperation divide = new DivisionOperation();
		
		
		
		
		

		System.out.println("-------------------------");
		System.out.println("Question 3: Create Method");
		System.out.println("-------------------------");
		System.out.println("Question 4: Test Your Code");
		/*
		 * Test your code here:
		 * 		- Declare two double variables
		 *      - Call your new method, with all 4 implementing classes
		 *      					  and the two variables.
		 *      - Don't forget to print out the result returned by the method
		 */
		double d1 = 10;
		double d2 = 5;
		

		System.out.println("   Parameters:");
		System.out.println("\tParameter 1: " );
		System.out.println("\tParameter 2: " );

		/* 
		 * Calls to the method using implementing classes
		 */
		System.out.println("   Results:");
		
		System.out.println("\t2a - Addition:  ");
		/*
		 * Put call to method using addition here
		 */
		System.out.println(eval(add,d1,d2));
		
		System.out.println("\t2b - Subtraction:  ");
		/*
		 * Put call to method using subtraction here
		 */
		System.out.println(eval(subtract,d1,d2));
		
		System.out.println("\t2c - Multiplication:  ");
		/*
		 * Put call to method using multiplication here
		 */
		System.out.println(eval(multiply,d1,d2));
		
		System.out.println("\t2d - Division:  ");
		/*
		 * Put call to method using division here
		 */
		System.out.println(eval(divide,d1,d2));

		
		System.out.println("-------------------------");
	}
	
	/*
	 * Method -- Question 3:
	 */
	public static double eval(MathOperation mathOp, double d1, double d2) {
		return mathOp.evaluate(d1, d2);
	}
	
	
		
}
