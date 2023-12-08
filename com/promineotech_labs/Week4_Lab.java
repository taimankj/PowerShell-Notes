package com.promineotech_labs;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
public class Week4_Lab {
	
	public static void main(String[] args) {
		
		System.out.println("---Problem 1---");
		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder problemOne = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			if (i == 9) {
				problemOne.append(i);
			} else {
				problemOne.append(i + "-");
			}
		}
		System.out.println(problemOne);
		
		System.out.println();
		System.out.println("---Problem 2---");
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> problemTwo = new ArrayList<String>();
		for (Integer i = 1; i < 6; i++) {
			String word = "";
			for (int j = 0; j < i; j++) {
				word += i.toString();
			}
			problemTwo.add(word);
		}
		
		for (String word : problemTwo) {
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("---Problem 3---");
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		List<String> wordsThree = new ArrayList<String>();
		wordsThree.add("fire");
		wordsThree.add("flames");
		wordsThree.add("four");
		wordsThree.add("fo");
		wordsThree.add("fe");
		wordsThree.add("follow");
		wordsThree.add("fe");
		wordsThree.add("foward");
		String smallestWord = getShortest(wordsThree);
		System.out.println(smallestWord);
		
		System.out.println();
		System.out.println("---Problem 4---");
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		for (String word : wordsThree) {
			System.out.println(word);
		}
		System.out.println();
		List<String> firstLastSwap = swapFirstAndLast(wordsThree);
		for (String word : firstLastSwap) {
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("---Problem 5---");
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		String wordsMeshed = concat(wordsThree);
		System.out.println(wordsMeshed);
		
		
		System.out.println();
		System.out.println("---Problem 6---");
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		for (String word : wordsThree) {
			System.out.println(word);
		}
		System.out.println("------");
		List<String> newList = listContains(wordsThree,"fo");
		for (String word : newList) {
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("---Problem 7---");
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbersProblem7 = new ArrayList<Integer>();
		numbersProblem7.add(2); //divisible by 2
		numbersProblem7.add(3); //divisible by 3
		numbersProblem7.add(7); //not divisible by 2, 3, or 5
		numbersProblem7.add(5); //divisible by 5
		numbersProblem7.add(4); //divisible by 2
		numbersProblem7.add(9); //divisible by 3
		numbersProblem7.add(25); //divisible by 5
		numbersProblem7.add(121); //not divisible by 2, 3, or 5
		numbersProblem7.add(8); //divisible by 2
		numbersProblem7.add(27); //divisible by 3
		numbersProblem7.add(35); //divisible by 5
		numbersProblem7.add(77); //not divisible by 2, 3, or 5
		List<List<Integer>> problem7 = divisible235(numbersProblem7);
		for (List<Integer> list : problem7) {
			for (Integer n : list) {
				System.out.println(n);
			}
			System.out.println("\n---");
		}

		System.out.println();
		System.out.println("---Problem 8---");
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		List<Integer> wordLength = getWordLength(wordsThree);
		for (int i = 0; i < wordLength.size(); i++) {
			System.out.println("The length of word " + wordsThree.get(i) + " is " + wordLength.get(i));
		}
		
		//System.out.println();
		//System.out.println("---Problem 9---");
		// 9. Create a set of strings and add 5 values
		Set<String> problemNine = new HashSet<String>();
		
		for (int i = 0; i < 6; i++) {
			problemNine.add(wordsThree.get(i));
		}
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		Set<String> startswith = findAllThatStartWith(problemNine, 'a');
		

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}


	


	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	public static Set<String> findAllThatStartWith(Set<String> list, char character) {
		Set<String> results = new HashSet<String>();

		for (String string : list) {
			if (string.charAt(0) == character) {
				results.add(string);
			}
		}

		return results;
	}

	
	// Method 8:
	public static List<Integer> getWordLength(List<String> list) {
		List<Integer> wordLength = new ArrayList<Integer>();
		
		for (String word : list) {
			wordLength.add(word.length());
		}
		
		return wordLength;
	}

	
	// Method 7:
	public static List<List<Integer>> divisible235(List<Integer> list) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		
		
		for (int i = 0; i < list.size(); i++) {
			
			int value = list.get(i);
			
			if (value % 2 == 0) {
				list1.add(value);
			} else if (value % 3 == 0) {
				list2.add(value);
			} else if (value % 5 == 0) {
				list3.add(value);
			} else {
				list4.add(value);
			}
			
		}
		
		result.add(list1);
		result.add(list2);
		result.add(list3);
		result.add(list4);
		
		return result;
	}

	
	// Method 6:
	public static List<String> listContains(List<String> list, String word) {
		List<String> newList = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("fo")) {
				newList.add(list.get(i));
			}
		}
		
		return newList;
	}

	
	// Method 5:
	public static String concat(List<String> list) {
		String result = "";
		
		for (String word : list) {
			result += word;
		}
		
		return result;		
	}
	
	
	// Method 4:
	public static List<String> swapFirstAndLast(List<String> list) {
		List<String> returnList = list;
		
		String first = returnList.remove(0);
		String last = returnList.remove(returnList.size()-1);
		
		returnList.add(0, last);
		returnList.add(returnList.size()-1, first);
		
		
		return returnList;
	}
	
	
	// Method 3:
	public static String getShortest(List<String> list) {
		String result = list.get(0);
		
		for (int i = 1; i < list.size(); i++) {
			if (result.length() <= list.get(i).length()) {
				continue;
			} else {
				result = list.get(i);
			}
		}
		
		return result;
	}
	

}
