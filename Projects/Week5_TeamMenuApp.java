package Projects;

import Classes.*;
import java.util.*;

public class Week5_TeamMenuApp {
	
	public static Scanner scanner = new Scanner(System.in);
	
	static List<Team> teams = new ArrayList<Team>();
	
	public static void main(String[] args) {
		
		int decision = 0;
		while (true) {
			
			printOptions();
			decision = scanner.nextInt();
			if (decision == 1) {
				System.out.println();
				createNewTeam();
			} else if (decision == 2) {
				System.out.println();
				addPlayerToTeam();
			} else if (decision == 3) {
				System.out.println();
				//removePlayerFromTeam();
			} else if (decision == 4) {
				System.out.println();
				describeTeam();
			} else {
				System.out.println();
				System.out.println("Please Pick a Valid Option!");
			}
			
			System.out.println();
		}
		
	}
	
	private static void printOptions() {
		System.out.println("1) Create New Team"
				+ "\n2) Add New Player To Team"
				+ "\n3) Remove Player From Team"
				+ "\n4) View Team Info");
		System.out.print("Enter an option above: ");
	}
	
	private static void createNewTeam() {
		System.out.print("Enter the name of the team you want to create: ");
		String name = scanner.next();
		teams.add(new Team(name));
	}
	
	private static void removePlayerFromTeam() {
		printTeamNames();
		Team foundTeam = findTeam();
		if (foundTeam == null) {
			System.out.println("That team does not exist. Please try again.");
		} else {
			System.out.println("Enter the name of the player you wish to remove.");
			System.out.print("Name: ");
			String playerName = scanner.next();
			foundTeam.removePlayer(playerName);
		}
		
	}
	
	private static void addPlayerToTeam() {
		printTeamNames();
		Team foundTeam = findTeam();
		if (foundTeam == null) {
			System.out.println("That team does not exist. Please try again.");
		} else {
			System.out.println("Enter the name, position, and specialty of the player you wish to add.");
			System.out.print("Name: ");
			String playerName = scanner.next();
			System.out.print("\nPosition: ");
			String position = scanner.next();
			System.out.print("\nSpecialty: ");
			String specialty = scanner.next();
			foundTeam.addPlayer(new Player(playerName, position, specialty));
		}
	}
	
	private static void describeTeam() {
		for (Team team : teams) {
			team.describe();
		}
	}
	
	private static void printTeamNames() {
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeam() {
		System.out.print("Enter the name of the team: ");
		String teamName = scanner.next();
		for (Team team : teams) {
			if (team.getName().equals(teamName)) {
				return team;
			}
		}
		return null;
	}
	
}
