package com.promineotech;

public class Week4_Collections {
	
	public static void main(String[] args) {
		System.out.println("I:");
		//StringBuilder - is mutable unlike the String object; used when want to create a dynamically changeable string
		//use a String when you have a constant where it is set only once and not changed at all
		//can be declared with a String value or nothing if wanted
		StringBuilder firstName = new StringBuilder("Keoni");
		System.out.println(firstName);
		
		//declared with no value
		StringBuilder fullName = new StringBuilder();
		System.out.println(fullName); //prints nothing except an empty line
		
		//StringBuilder methods
		//toString() - returns the value of the object StringBuilder as a String
		System.out.println(fullName.toString());
		
		//append(String) - concatenates a String to the given StringBuilder
		fullName.append(firstName);
		System.out.println(fullName);
		
		//charAt(int) - returns the character at a given index
		System.out.println(fullName.charAt(0));
		
		//deleteCharAt(int) - deletes a character at a given index of the StringBuilder object and returns the new value of StringBuilder object
		fullName.deleteCharAt(0);
		System.out.println(fullName);
		
		//delete(start int, end int) - deletes a portion of the String from start int (inclusive) to end int (exclusive) and returns the value of the new StringBuilder's object vaule
		StringBuilder lastName = new StringBuilder("TaiTaimanglo");
		System.out.println(lastName);
		lastName.delete(0,  3);
		System.out.println(lastName);
		
		//indexOf(String or char) returns the index of a given sequence of characters' or a single character's first occurrence
		System.out.println(lastName.indexOf("mang"));
		
		//replace(start int, end int, String) - replaces a sequence of characters at the start int (inclusive) to end int (exclusive) with a given String and returns that new object's value
		StringBuilder password = new StringBuilder("agoodpassword");
		System.out.println(password);
		password.replace(1,5,"bad");
		System.out.println(password);
		
		//reverse() - reverses the sequence of the StringBuilder's object value and returns it
		System.out.println(password.reverse());
		System.out.println(password);
		
		//insert(start int, string) - inserts a string at starting int and pushes the string after the given sequence right
		StringBuilder exampleName = new StringBuilder();
		String fName = "Bob";
		String lName = "Brown";
		String middleInitial = "B";
		exampleName.append(fName);
		exampleName.append(lName);
		System.out.println(exampleName); //outputs BobBrown
		exampleName.insert(fName.length(), "/" + middleInitial + "/"); //inserts "/B/" at the second B in exampleName and pushes the sequence from second B and on to the right
		System.out.println(exampleName); //outputs Bob B Brown
		
		System.out.println("\n\n\n");
	}

}
