package Projects;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Week4_MenuApp_Maps {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static Map<String, Long> phoneBook = new HashMap<String, Long>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != 4) {
			
			printMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.println("Please pick a valid option!");
			}
			
		}
		
	}

	private static void deleteContact() {
		
		if (phoneBook.isEmpty()) {
			System.out.println("No contacts in here.");
			System.out.println();
			return;
		}
		
		System.out.print("Enter the person's name you want to delete with the same exact spelling: ");
		phoneBook.remove(scanner.next());
		System.out.println();
		
	}

	private static void addContact() {
		
		System.out.print("Enter the person's first name and last name with no spaces: ");
		String key = scanner.next();
		System.out.println();
		System.out.print("Enter the associated phone number with " + key + " using no symbols." +
		"(Ex: 6717473452): ");
		long value = scanner.nextLong();
		
		if (phoneBook.containsValue(value)) {
			System.out.println("Phone number already exists.");
			System.out.println("Please try again");
			System.out.println();
			return; 
		}
		 
		phoneBook.put(key, value);
		System.out.println();
		
	}

	private static void displayPhoneBook() {
		
		Set<String> keys = phoneBook.keySet();
		
		if (phoneBook.isEmpty()) {
			System.out.println("No contacts in here.");
			System.out.println();
			return;
		}
		
		for (String key : keys) {
			System.out.println(key + " : " + phoneBook.get(key));
		}
		
		System.out.println();
		
	}

	private static int getUserChoice() {
		return scanner.nextInt();
	}

	private static void printMenu() {
		
		System.out.println("1) Display Phone Book");
		System.out.println("2) Add New Contact");
		System.out.println("3) Delete Contact");
		System.out.println("4) Exit");
		System.out.println("--------------------------");
		
	}
	
	

}
