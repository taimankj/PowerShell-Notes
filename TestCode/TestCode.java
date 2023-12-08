package TestCode;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class TestCode {
	
	static String name = "keoni";
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		/*
		 * System.out.print("Input: "); String name = s.next();
		 * System.out.println(name.matches("keoni"));
		 */
		
		/*
		 * int[] testArray = {1, 2, 3, 4}; for (int i = 0; i < testArray.length; i++) {
		 * while (i < testArray.length) { System.out.println("While loop: " + i); i++; }
		 * System.out.println("For loop: " + i); }
		 */
		
		String test = "10";
		int x = 10;
		//System.out.println(test.charAt(1));
		
		int five = 5;
		int two = 2;
		//System.out.println(five/two); //is 2.5 but returns 2
		/*
		 * switch (10%5) { case 0: System.out.println("divisible by 5"); break; default:
		 * System.out.println("not divisible by 5"); }
		 */
		int y = Integer.parseInt(test); //turns String to int
		String xInt = Integer.toString(x); //turns int to String
		
		int digits = 515;
		int result = 0;
		
		/*
		 * while (digits > 0) { System.out.println("digits is currently " + digits);
		 * System.out.println("digits % 10 is " + digits % 10); result += digits % 10;
		 * System.out.println("digits / 10 is " + digits / 10); digits /= 10; }
		 */
		
		//System.out.println("fivestand".indexOf("!"));
		
		int[] originalArray = {1, 2, 3, 4, 5};

        // Using clone() to create a shallow copy
        int[] copiedArray = originalArray.clone();
        
		/*
		 * for (int i = 0; i < originalArray.length; i++) {
		 * System.out.println(originalArray[i]); System.out.println(copiedArray[i]); }
		 */
        
        //System.out.println(power(3,4));
        
        String palindrome = "asdfghjkllkjhgfdsa";
        //System.out.println(isPalindrome(palindrome));
        
        StringBuilder name = new StringBuilder("inoek");
        String nameReversed = reverseStrBldr(name);
        System.out.println(name);
        System.out.println("variable name reversed is : " + nameReversed);
        
		System.out.println("END");
		
		System.out.println("this is a git test");
		
		System.out.println("f\sf");
		System.out.println("f f");
		
		System.out.println("------------------");
		List<String> wordsThree = new ArrayList<String>();
		wordsThree.add("fire");
		wordsThree.add("flames");
		wordsThree.add("four");
		wordsThree.add("fo");
		wordsThree.add("fe");
		
		Set<String> problemNine = new HashSet<String>();
		
		for (int i = 0; i < 5; i++) {
			problemNine.add(wordsThree.get(i));
		}
		
		System.out.println("Iterator");
		System.out.println(problemNine.iterator());
		
		String name1 = "rowland";
		String name2 = "Rowland";
		
		System.out.println(name1 == name2);
		
		List<Character> alphabet = new ArrayList<>();
		for(int i = 97; i < (97 + 26); i++){
		    alphabet.add((char)i); //(char)i is type casting by turning the integer 'i'
		} //into a character at the Unicode code point of that character's position
		System.out.println(alphabet);
		
		System.out.println("-----Linked List-----");
		List<String> movieLine = new LinkedList<>();
		movieLine.add("Keoni");
		movieLine.add("Tiffani");
		movieLine.add("Ahu");
		movieLine.add("Napu");
		movieLine.add("Taj");
		movieLine.add("Theisen");
		for (String personInLine : movieLine) {
			System.out.println(personInLine);
		}
		
		
	}
	
	public static int power(int base, int exponent) {
		int result = 1;
		for (int index = 1; index <= exponent; index++) {
			result = result * base;
		}
		return result;
	}
	
	public static boolean isPalindrome(String word) {
		char[] tempArr = new char[word.length()];
		word.getChars(0, tempArr.length, tempArr, 0); //getChars stores each character in variable 'palindrome' and stores it into the array 'tempArr' starting at index 0 (the fourth argument passed in)
		char[] reversedArr = new char[tempArr.length];
		
		//creates reversed order array of tempArr
		for (int i = 0; i < reversedArr.length; i++) {
			reversedArr[i] = tempArr[tempArr.length - 1 - i];
		}
		
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == reversedArr[i]) {
				continue;
			} else {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static String reverseStrBldr(StringBuilder word) {
		StringBuilder reversed = new StringBuilder();
		int wordLength = word.length();
		
		for (int i = 0; i < wordLength; i++) {
			char letter = word.charAt(wordLength - 1 - i);
			System.out.println("Appending " + letter + " to reversed variable: " + reversed);
			reversed.append(letter);
		}
		
		return reversed.toString();
	}
	
	
}

