package com.promineotech;

import java.util.List;
import java.util.ArrayList;

public class Week6_Debugging_UnitTest {
	/*
	 * 1) Right Click a line number to create a breakpoint
	 ****1a) The cod will run up to the breakpoint and stop at the breakpoint
	 * 2) You now have the option to debug line by line
	 ****2a) Stepping Over - goes to the next line of code
	 ****2b) Stepping Into - if there is a method, we step into the method body
	 ****2c) Step Return - steps out of the method body immediately
	 */
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		addNames(names);
		int index = findIndexOfName(names, "Sam");
		System.out.println(index);
		
	}
	
	private static void addNames(List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hilary");
		names.add("Joan");
	}
	
	private static int findIndexOfName(List<String> names, String name) {
		int index = -1;
		for (int i = 1; i < names.size(); i++) {
			if (names.get(i).equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
}
      