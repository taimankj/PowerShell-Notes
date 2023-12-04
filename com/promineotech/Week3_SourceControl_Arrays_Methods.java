package com.promineotech;

public class Week3_SourceControl_Arrays_Methods {

	public static void main(String[] args) {
		//Arrays
		System.out.println("I:");
		//First way to make an array
		String[] names = new String[3];
		names[0] = "Tiffani";
		names[1] = "Keoni";
		names[2] = "Ahu";
		//Second way to make an array
		int[] ages = {27, 24, 4};
		//Looping through array
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//Enhanced for loop
		for (int n : ages) {
			System.out.println(n);
		}
		//Remember that arrays are zero based index meaning the first element of an array
		//is accessed with a 0 instead of a 1
		System.out.println(names[0] + " is " + ages[0] + " years old.");
		//2D or Multidimensional Arrays
		int[][] twoDArray = new int[2][3]; //the first [] is the length of twoDArray and the second [] is the length of the inner arrays i.e. 3
		int[][] twoDArrayvTwo = { {1,2,3}, {4,5,6} };
		System.out.println("The length of twoDArray is " + twoDArray.length);
		//Accessing a 2D array
		System.out.println(twoDArrayvTwo[twoDArrayvTwo.length-1][twoDArrayvTwo[twoDArrayvTwo.length-1].length-1]); //this is just really twoDArrayvTwo[1][2]
		System.out.println();
		//Methods
		System.out.println("II:");
		//Methods are created outside of "public static void main(String[] args)"
		//But are still kept within our "public class <filename>"
		String fullName = outFullName(names[0], "Taimanglo");
		System.out.println(fullName);
		
		noOutFullName(names[1], "Taimanglo"); 
		System.out.println(nameAndAge(names,  ages,  2));
		
		System.out.println();
		//Objects
		System.out.println("III:");
		//Objects are not primitive data types but are instead things like String or an array
		//Objects contains properties and methods
		//Methods always contain () after it's name, but properties do not
		
		//This .length() is a method of the String object and gives the count of characters in a given string
		//Tiffani -> 7
		System.out.println(names[0].length());
		//To find methods or properties of an obect, google search "java <object type>"
		//Click the oracle link
		System.out.println(names[0].equals(names[1]));
		
		//This works
		String bodyPart = new String("Toe");
		System.out.println(bodyPart);
		
		System.out.println();
		//Classes
		System.out.println("IV:");
		
		Person wife = new Person();
		wife.name = "Tiffani Taimanglo";
		wife.age = 27;
		//System.out.println(wife.name);
		//System.out.println(wife.age);
		wife.nameAndAge();
		
		Person wife2 = new Person();
		wife2.name = "Tiffani Taimanglo";
		wife2.age = 27;
		
		Person wife3 = wife2;
		
		//Will produce false because they're both pointed at different locations in memory
		System.out.println(wife == wife2);
		System.out.println(wife.equals(wife2));
		///ALL OBJECTS HAVE THE .equals() method
		
		//Will produce true because primitive data types are equal
		System.out.println(wife.name == wife2.name);
		
		//Will produce true because wife3 points to wife2
		System.out.println(wife3 == wife2);
		
		//Personv2 me = new Personv2("Keoni Taimanglo", 24);
		//System.out.println(me.name);
		//System.out.println(me.age);
		//me.nameAndAge();

	}
	
	//Methods always start with the "public static" keywords
	//The third word is a data type if we wanted to return a value or void if we're not returning anything
	//The fourth word is the methods name, kind of like declaring a variable
	//Within the parenthesis are parameters that when a method is called arguments go in place for those
	///Parameters can be of any type or object. Also methods do not need any parameters if not needed
	
	//This method returns a String
	public static String outFullName(String fName, String lName) {
		return fName + " " + lName;
	}
	
	//This method doesn't return anything but instead prints a full name
	public static void noOutFullName(String fName, String lName) {
		System.out.println(fName + " " + lName);
	}
	
	//This method returns the name and the name's age
	public static String nameAndAge(String[] names, int[] ages, int position) {
		return names[position] + " is " + ages[position] + " years old.";
	}
	
	//Methods from video
	public static double sumOfArray(double[] numbers) {
		double result = 0;
		for (double n : numbers) {
			result += n;
		}
		return result;
	}
	
	public static double avgOfArray(double[] numbers) {
		double arraySum = sumOfArray(numbers);
		return arraySum / numbers.length;
	}
	
	public static String multiString(String wrd, int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += wrd;
		}
		return result;
	}
}

//Classes are created outside the "public class <filename>" code block
class Person {
	//Instance variables
	String name;
	int age;
	
	void nameAndAge() {
		System.out.println(name + " is " + age + " years old.");
	}
}

//contains constructors
class Personv2 {
	String name;
	int age;
	
	Personv2(String name, int age) {
		this.name = name;
		this.age = age;
		this.nameAndAge();
	}
	
	void nameAndAge() {
		System.out.println(name + " is " + age + " years old.");
	}
	
	
}

