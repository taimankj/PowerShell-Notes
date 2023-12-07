package Projects;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Week4_MenuApp {
	
	public static List<String> students = new ArrayList<String>();
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != 4) {
			
			showMenu();
			
			choice = getUserChoice();
			
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
				continue;
			} else {
				System.out.println("Please select a valid option...");
			}
			
		}
		
		
	}
	
	public static void showMenu() {
		
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("----------------------------------");
		
	}
	
	public static int getUserChoice() {
		
		return scanner.nextInt();
		
	}
	
	public static void printStudentNames() {
		
		if (students.isEmpty()) {
			System.out.println("No students here.");
			System.out.println();
			return;
		}
		
		System.out.println();
		for (String student : students) {
			
			System.out.println("Student " + student + " at position " + students.indexOf(student));
		}
		System.out.println();
	}
	
	public static void addNewStudent() {
		
		System.out.print("Enter the student you would like to add: ");
		students.add(scanner.next());
		System.out.println("Student added: " + students.get(students.size() - 1));
		System.out.println();
		
	}
	
	public static void deleteStudent() {
		
		System.out.print("Enter the position of the student you would like to delete: ");
		if (students.isEmpty()) {
			System.out.println("No students to delete here.");
			return;
		}
		
		boolean wrongChoice = false;
		while (!wrongChoice) {
			
			System.out.print("Pick a student from position 0 to " + (students.size()-1) + ": ");
			int position = getUserChoice();
			if ((position < 0) || (position >= students.size())) {
				
				System.out.println("Invalid input detected.");
				System.out.println("Please pick a valid option...");
				continue;
				
			}
			wrongChoice = true;
			System.out.println("Removing student at " + position + ".");
			System.out.println();
			students.remove(position);
			
		}
				
	}
	
}
