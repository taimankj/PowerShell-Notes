package Projects;

import java.util.Scanner;

public class Week3_MenuApp {
	
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 * Add team member
		 * View team member
		 * View all team members
		 * Delete team member by position
		 * Delete all team members
		 */
		
		String[] team = new String[5];
		int decision = 0;
		
		while (decision != -1) {
			System.out.println();
			showMenu();
			System.out.print("Decision: ");
			decision = s.nextInt();
			
			switch (decision) {
			case 1:
				showTeam(team);
				break;
			case 2:
				showTeamMember(team);
				break;
			case 3:
				addTeamMember(team);
				break;
			case 4:
				deleteTeamMember(team);
				break;
			case 5:
				deleteAllTeamMembers(team);
				break;
			case -1:
				System.out.println("Exiting...");
				continue;
			default:
				System.out.println("Invalid input detected. Please try again.\n");
			}
		}
		
		System.out.println("END");
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete all Team Members");
	}
	
	public static void showTeam(String[] team) {
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + ": " + team[i]);
		}
	}
	
	public static void showTeamMember(String[] team) {
		int memberPosition = getMemberPosition(team);
		System.out.println("Member at " + memberPosition + ": " + team[memberPosition]);
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Please enter the team member's name: ");
		String newMember = s.next();
		System.out.println();
		int memberPosition = getMemberPosition(team);
		
		if (team[memberPosition] != null) {
			System.out.println("Member " + team[memberPosition] + " at position " + memberPosition + " already.");
			System.out.print("Do you want to override this? Type yes or no: ");
			String decision = s.next();
			if (decision.matches("yes")) {
				System.out.println("Adding " + newMember + " at position " + memberPosition);
				team[memberPosition] = newMember;
			} else {
				System.out.println("Choose different position.");
				addTeamMember(team);
				return;
			}
		} else {
			System.out.println("Adding " + newMember + " at position " + memberPosition);
			team[memberPosition] = newMember;
		}
	}
	
	public static void deleteTeamMember(String[] team) {
		int memberPosition = getMemberPosition(team);
		System.out.print("Are you sure? yes or no: ");
		String decision = s.next();
		if (decision.matches("yes")) {
			System.out.println("Removing " + team[memberPosition] + " from position " + memberPosition + ".");
			team[memberPosition] = null;
		} else {
			System.out.println("No member deleted.");
		}
	}
	
	public static void deleteAllTeamMembers(String[] team) {
		System.out.print("Are you sure? yes or no: ");
		String decision = s.next();
		if (decision.matches("yes")) {
			System.out.println("Deleting all team members...");
			for (int i = 0; i < team.length; i++) {
				team[i] = null;
			}
			System.out.println("All members removed.");
		} else {
			System.out.println("No members deleted.");
		}
	}

	public static int getMemberPosition(String[] team) {
		System.out.print("Please enter the requested position: ");
		int memberPosition = s.nextInt();
		while ((memberPosition >= team.length) || (memberPosition < 0)) {
			System.out.println("Invalid Input. Please Try Again.");
			System.out.print("Please enter a valid member's position: ");
			memberPosition = s.nextInt();
		}
		return memberPosition;
	}
	
	
}

