package com.promineotech_labs;

public class Week3_Lab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = {32, 534125, 342, 12, 432, 1235, 2341, 324312, 34221};
		
		
		// 2. Print out the first element in the array System.out.println(array[0]);
		  
		// 3. Print out the last element in the array without using the number 5
		//System.out.println(array[array.length-1]);
		  
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(array[6]);
		  
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(array[-1]);
		 
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int n : array) {
			//System.out.println(n);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int n : array) {
			sum += n;
		}
			
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = sum / array.length;
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int n : array) {
			if (n % 2 != 0) {
				//System.out.println(n);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int namesSum = 0;
		for (String name : names) {
			namesSum += name.length();
		}
		//System.out.println(namesSum);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		//morningGreeting("Keoni");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String myGreeting = getMorningGreeting("Keoni");
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		boolean isNameBig = isStringLrg("TiffaniTaimanglo", 10);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] utensils = {"Pen","Pencil","Marker","Crayon","Paintbrush"};
		boolean doesPenExist = existsInArray(utensils,"Pen");
		//System.out.println("Does or doesn't exist: " + doesPenExist);
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int smallest = getSmallest(array);
		//System.out.println("Smallest out of the array is: " + smallest);
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] arrayTwo = {5.1, 2.5, 32.2, 156.1551};
		//System.out.println(doubleArrayAvg(arrayTwo));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] lengthOfWords = getStringsLength(utensils);
		for (int i = 0; i < utensils.length; i++) {
			System.out.println(utensils[i] + " is " + lengthOfWords[i] + " characters long.");
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		boolean isEvenWordsGreater = isEvenBigger(utensils);
		System.out.println(isEvenWordsGreater);
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		String myWord = "deleveled"; 
		boolean isWordPalindrome = isPalindrome(myWord);
		if (isWordPalindrome) {
			System.out.println(myWord + " is a palindrome.");
		} else {
			System.out.println(myWord + " is not a palindrome.");
		}
		
		
	}
	

	
	// Method 13:
	public static void morningGreeting(String name) {
		System.out.println("Good Morning " + name + ".");
	}

	// Method 14:
	public static String getMorningGreeting(String name) {
		return "Good Morning " + name + ".";
	}
	
	// Method 15:
	public static boolean isStringLrg(String word, int n) {
		if (word.length() > n) {
			return true;
		}
		return false;
	}
	
	// Method 16:
	public static boolean existsInArray(String[] words, String wordA) {
		for (String wordB : words) {
			if (wordB == wordA) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	//{1, 5, 2, 8, 13, 6} --> should return 1
	public static int getSmallest(int[] numbers) {
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if ((i+1) == numbers.length) {
				continue;
			} else if (smallest < numbers[i]) {
				continue;
			} else {
				smallest = numbers[i];
			}
			System.out.println();
		}
		return smallest;
	}
	
	// Method 18:
	public static double doubleArrayAvg(double[] numbers) {
		double sum = 0;
		for (double n : numbers) {
			sum += n;
		}
		return sum / numbers.length;
	}
	
	// Method 19:
	public static int[] getStringsLength(String[] words) {
		int[] wordLengths = new int[words.length];
		
		for (int i = 0; i < words.length; i++) {
			wordLengths[i] = words[i].length();
		}
		
		return wordLengths;
	}
	
	// Method 20:
	public static boolean isEvenBigger(String[] words) {
		int[] wordLengths = getStringsLength(words);
		int evenCount = 0;
		int oddCount = 0;
		
		for (int n : wordLengths) {
			if ((n % 2) == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.println("Even count is " + evenCount);
		System.out.println("Odd count is " + oddCount);
		
		if (evenCount > oddCount) {
			return true;
		} else {
			return false;
		}
	}
	
	// Method 21:
	public static boolean isPalindrome(String word) {
		String lowerWord = word.toLowerCase();
		int wordlength = lowerWord.length();
		if (lowerWord.length() <= 0) {
			return false;
		} else {
			int lastEle = wordlength;
			for (int i = 0; i < wordlength; i++) {
				lastEle--;
				System.out.println("Checking if " + lowerWord.charAt(i) + " at index " + i + " matches " + lowerWord.charAt(lastEle) + " at index " + lastEle + ".");
				if (wordlength / 2 == i) { // && (lowerWord.charAt(i) == lowerWord.charAt(lastEle))
					return true;
				} else if (lowerWord.charAt(i) == lowerWord.charAt(lastEle)) {
					continue;
				} else {
					return false;
				}
			}
			return true;
		}
	}

}
