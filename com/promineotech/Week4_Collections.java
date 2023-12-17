package com.promineotech;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

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
		//System.out.println(fullName); //prints nothing except an empty line
		
		//StringBuilder methods
		//toString() - returns the value of the object StringBuilder as a String
		//System.out.println(fullName.toString());
		
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
		password.replace(1,5,"/bad/"); //replaces good with bad
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
		
		System.out.println();
		System.out.println("II:");
		//Lists - are like an array except is orderd, preserves insertion order, allows positional access and insertion of items, allows duplicates, and is a collection of Objects
		//When using Lists, it must always be imported outside the public class method as "import java.util.List;"
		//List<E> - this is the List signature and E is the Oject or Class used in the list
		
		////to use primitive data types use their corresponding class
		////All classes automatically wraps and unwraps the value of the corresponding primitive data type in an object in a List
			//int - Integer
			//double - Double
			//long - Long
			//short - Short
			//float - Float
			//char - Character
		
		//List<String> - is a list of Strings only
		//new ArrayList<E>() - this is the value of List<E> and must be imported before use as "import.java.util.ArrayList;"
		List<String> sports = new ArrayList<String>();
		
		//List Methods
		
		//List.add(value) - appends List with value at 0 index, then 1 for another value, then on
		///It is possible to add the 'null' value
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		
		//Where in an Array, you can't just print the array without iterating into it
		//You can though do this with a List
		System.out.println(sports); //outputs -> [Wrestling, Soccer, Football]
		
		
		//List.size() - sames as Array.length
		System.out.println(sports.size());
		
		//List.get(index) - returns value at index in List
		System.out.println(sports.get(sports.size()-1));
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		//Enhanced for loop - Lists
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		//List.remove(index) - removes value in List at index and shifts values after that index one value left (i.e. 1 <-- 2)
		sports.remove(1);
		System.out.println();
		for (int i = 0; i < sports.size(); i++) {
			System.out.println("At index " + i);
			System.out.println(sports.get(i));
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		//List.isEmpty() - returns true if List contains no elements
		System.out.println(numbers.isEmpty());
		
		//List can also be implemented using LinkedList, Vector, and Stack instead of ArrayList
		
		
		System.out.println();
		System.out.println("III:");
		//Collections - an object with groups of objects within such as List; but there are also Sets, Maps, and others
			//methods of this class all throw a NullPointerException if the collections or class objects provided to them are null
		
		//Lists are implemented with ArrayList, LinkedList, Vector, Stack, etc
		//Maps are implemented with HashMap, TreeMap, LinkedHashMap, etc
		//Sets are implemented with HashSet, TreeSet, LinkedHashSet, etc
		///all implementations must be imported outside of the "public class <filename>" method as 'import java.util.<implementation>
		
		System.out.println("III(A):");
		//Set
			//Doesn't allow duplicates
			//Is not ordered
			//allows null
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alabama"); //the following is dead code and Alabama will not be added to the set 
							   //the size is still currently 1
		
		//only prints one because a set doesn't allow duplicates
		for (String state : states) {
			System.out.println(state);
		}
		System.out.println(states.size()); //outputs 1
		
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		System.out.println();
		
		//will print out of order of adding
		for (String state : states) {
			System.out.println(state);
		}
		
		//Set.contains(value) - returns true if this set contains the specified value
		System.out.println(states.contains("California")); //returns true
		
		//Set.remove(value) - removes the specified element from this set if it is present
		states.remove("Arkansas");
		System.out.println(states.contains("Arkansas"));

		System.out.println();
		System.out.println("III(B):");
		//Map
			//Holds <key, value> pairs
			//Values can be duplicate
			//keys can NOT be duplicate
		
		//Map<K, V> - Map signature with K being key and V being value
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		
		//uses Map.put(K, V) instead of Collection.add(value)
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		System.out.println(racerPlacements);
		
		Map<String, String> dictionary = new HashMap<String, String>(); //First String is word and second String is definition
		dictionary.put("Augment", "make (something) greater by adding to it; increase");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice");
		
		//Map.get(K) - will return value found at K
		System.out.println(racerPlacements.get(1));
		
		//Map.keySet() - returns a Set view of the keys contained in this map
		Set<Integer> racerKeys = racerPlacements.keySet();
		System.out.println("Key : Value");
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key)); //key is value in a key set
		}
		
		//Map.size() - returns the number of key-value mappings in this map
		System.out.println(racerPlacements.size());
		
		//Map.remove(K) - removes the mapping for a key from this map if it is present 
		racerPlacements.remove(3);
		System.out.println(racerPlacements.size());
		
		//Map.values() - returns a Collection view of the values contained in this map
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
	}

}
