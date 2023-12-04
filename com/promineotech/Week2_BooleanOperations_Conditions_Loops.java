package com.promineotech;

import java.util.Scanner;

public class Week2_BooleanOperations_Conditions_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BOOLEAN OPERATORS
		// == is equal to
		// < is less than
		// > is greater than
		// <= is less than or equal to
		// >= is greater than or equal to


		
		System.out.println("I:");
		System.out.println(5 == '5');
		System.out.println(4 < 5);
		System.out.println(5 > 4);
		System.out.println(4 <= 4);
		System.out.println(7 >= 6);
		System.out.println();
		// && both sides must be True to output True
		// || at least one side must be True to output True
		System.out.println("II:");
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println((4 < 5) || (5 == '5'));
		System.out.println();
		
		
		
		//CONDITIONAL STATEMENTS
		//if, else - code will execute if the boolean expression in the 'if' parenthesis outputs true; if false, the else code block will execute
		System.out.println("III:");
		final boolean isHotOutside = false;
		if (isHotOutside) {
			System.out.println("It is hot as a mothafucka.");
		} else {
			System.out.println("My balls and my wife's clit are freezing their ass off.");
		}
		
		System.out.println();
		//if, else statements can be nested
		boolean x = 4 == 4;
		if (x) {
			if (5 == 5) {
				System.out.println("This is works");
			} else {
				System.out.println("This if false");
			}
		} else {
			System.out.println("This is false");
		}
		//flatten nested if, else code for better reading
		if (x && (5 == 5)) {
			System.out.println("This is also works");
		} else {
			System.out.println("This if false");
		}

		System.out.println();
		//if, else if, else - same logic as if, else statements, except an added 'else if' where we can have multiple conditionals
		//the expression that outputs to true first, that code will run and the rest will be skipped
		final boolean isHotOutsideGuam = true;
		if (isHotOutside) {
			System.out.println("It is hot as a mothafucka.");
		} else if (isHotOutsideGuam) {
			System.out.println("My balls are drenched in some sour ass sweat right now.");
		} else {
			System.out.println("Nope we still in Grand Forks.");
		}
		
		System.out.println();
		//switch - an easier way to use if, else if, else logic
		//will output a code block if the case is the same as the requested variable; if no case is matched, the default code block will output
		final String myDogsName = "Ahu";
		switch (myDogsName) {
			case "Bolt":
				System.out.println("BZZZ, WRONG!");
				break;
			case "Bitch":
				System.out.println("BZZZ, WRONG!");
				break;
			case "Boy":
				System.out.println("BZZZ, WRONG!");
				break;
			case "Ahu":
				System.out.println("You best remember his name fool!");
				break;
			default:
				System.out.println("Seriously Keoni. What's wrong with you.");
				
		}
		System.out.println();
		
		
		
		//LOOPS
		//Code that will execute again and again until the condition in the parentheses evaluates to false.
		System.out.println("IV:");
		
		//while loop
		int cupsOfWater = 1;
		while (cupsOfWater < 5) {
			System.out.println(cupsOfWater + " cup of water drank.");
			++cupsOfWater; //same as cupsOfWater += 1;
		}
		
		System.out.println();
		//for loop
		for (int bowlsOfFood = 0; bowlsOfFood < 5; bowlsOfFood++) { //++bowlsOfFood works too
			int eaten = bowlsOfFood + 1;
			System.out.println(eaten + " bowl of food eaten.");
		}
		
		System.out.println();
		//do while loop
		//following prints out multiples of twelve until it reaches it square
		int i = 12;
		int j = 1;
		do {
			System.out.println("12 times " + j + " is " + i + ".");
			++j;
			i += 12;
		} while (i < 145);
		
		System.out.println("V:");
		//USER INPUT
		//ALWAYS PUT import java.util.Scanner; ON LINE 2 TO USE THE SCANNER OBJECT
		Scanner sc = new Scanner(System.in); //creates a standard input stream
		
		System.out.print("Enter your name: ");
		String userName = sc.nextLine();
		System.out.print("Enter your nine digit user id: ");
		int userID = sc.nextInt();
		System.out.println("Welcome " + userName + ", user no. " + userID + ".");
		
		
		
	} 

}
