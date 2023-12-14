package com.promineotech;

import Classes.*;
import java.util.*;
import java.io.*;

public class Week5_ObjectOrientedProgramming {
	
	/*
	 *  Access Modifiers:
	 *  public			accessible everywhere
	 *  private			only accessible within the class itself
	 *  protected		accessible within the class, other classes in the same package, and all subclasses
	 *  No Modifier		sames as protected, except not accessible in a subclass in different packages
	 */
	
	public static void main(String[] args) {
		
		System.out.println("I:"
				+ "\n----------------------------------------\n");
		//Student Class
		System.out.println("Student Class");
		System.out.println("--------------------");
		Student student1 = new Student();
		//The following wil not work because in Classes.Student, these variables are initialized with the private access modifier
		/* student1.firstName = "Tom";
		 * student1.lastName = "Smith";
		 * student1.gradeLevel = 12;
		 * student1.phoneNumber = "480-123-4567"; 
		 */
		student1.setFirstName("Tom");
		student1.setLastName("Smith");
		student1.setGradeLevel(12);
		student1.setPhoneNumber("253-259-0319");
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		System.out.println();
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "904-320-9876", 11);
		System.out.println();
		student3.introduce();
		
		//Employee Class
		Employee salary = new SalariedEmployee(student3.getFirstName(), student3.getLastName(), 2500.00);
		Employee hourly = new HourlyEmployee(student2.getFirstName(), student2.getLastName(), 15.00, 75);
		Employee manager = new Manager(student1.getFirstName(), student1.getLastName(), 4500.00, 15.5);
		
		System.out.println();
		System.out.println("Employee Class");
		System.out.println("--------------------");
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		System.out.println();
		System.out.println("II:"
				+ "\n----------------------------------------\n");
		//Exceptions (Errors)
		
		
		
		/*
		 * Checked Exception - these are checked by the compiler at compiler time.
		 * Example:   syntax errors -- a missing semi-colon or closing curly brace, incorrect datatype assignment, returning the wrong data type from a method, etc.
		 * 
		 * Unchecked Exception - these are not caught by the compiler, included here are runtime exceptions and errors
		 * 
		 * Runtime Exception Example: Trying to access a Null Address, Out-of-Bounds Indices,
		 * Class:  RuntimeException, NullPointerException, ArithmeticException, etc.
		 * -------------------------------------------------------------------
		 * Error Exception Example:  Serious issues that cause an application to abort, or to stop running, including Memory or Stack Overflow Errors, 
	     * Class:  OutOfMemory, StackOverflow, VirtualMachineError, etc.
	     * 
	     * 
		 * try catch block - handles unccecked exceptions
		 */
		
		//Checked Exception Handling
		try {
			FileReader fileReader = new FileReader("something.txt");
			System.out.println("In try block");
		} catch (FileNotFoundException e) { //Exception is a super class of all exceptions
			System.out.println(e.toString());
			System.out.println("In catch block");
		} catch (Exception e) { //You are able to catch multiple exceptions (similar to if-else-elseif), though the superclass exception or highest level class exception should be catched last
			System.out.println("In second catch block");
		} finally { //Runs if try succeeds or fails. Will run no matter what.
			System.out.println("In finally block");
		}
		
		System.out.println("After try-catch block");
		
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("After second try-catch block");
	}
	
	//throws keyword with a given Exception class, handles exceptions in it's own try-catch block
	public static FileReader openFile(String fileName) throws FileNotFoundException {
		return new FileReader(fileName);
	}
	
}