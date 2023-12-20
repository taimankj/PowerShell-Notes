package com.promineotech_labs;

import LabClasses.TTTBoard;
import java.util.*;


public class Week6_TicTacToeLab {
	
	public static Scanner s = new Scanner(System.in);
	public static int turn = 0;
	public static boolean win = false;

	public static void main(String[] args) {
		
		//TTTBoard b1 = new TTTBoard();
		playGame();
		System.out.println("Game has ended.");
		
	}
	
	public static void playGame() {
		TTTBoard b1 = new TTTBoard();
		System.out.print("Type Y to play or type anything else to end the game: ");
		String gameChoice = s.next();
		
		
		if (gameChoice.toUpperCase().equals("Y")) {
			while (turn < 9 && !win) {
				if (turn % 2 == 0) {
					System.out.println("On turn: " + (turn+1) + ".");
					playerXTurn(b1);
				} else {
					System.out.println("On turn: " + (turn+1) + ".");
					playerYTurn(b1);
				}
				turn++;
			}
		}
		
		b1.describe();
		if (!win) {
			System.out.println("DRAW!");
		}
		System.out.println("Game ending...");
		
	}
	
	public static void playerXTurn(TTTBoard board) {
		while (!win) {
			board.describe();
			System.out.print("Player X, enter a row position from 0-2: ");
			int row = s.nextInt();
			System.out.println();
			System.out.print("Player X, enter a column position from 0-2: ");
			int column = s.nextInt();
			
			if (checkPositionEmpty(board, row, column)) {
				board.setPosition("X", row, column);
				checkWinner(board, "X");
				break;
			} else {
				System.out.println("Position filled already. Try again...");
			}
		}
	};
	
	public static void playerYTurn(TTTBoard board) {
		while (!win) {
			board.describe();
			System.out.print("Player Y, enter a row position from 0-2: ");
			int row = s.nextInt();
			System.out.println();
			System.out.print("Player Y, enter a column position from 0-2: ");
			int column = s.nextInt();
			
			if (checkPositionEmpty(board, row, column)) {
				board.setPosition("Y", row, column);
				checkWinner(board, "Y");
				break;
			} else {
				System.out.println("Position filled already. Try again...");
			}
		}
	};
	
	public static boolean checkPositionEmpty(TTTBoard board, int row, int column) {
		return board.getPosition(row, column).equals(" ");
	}
	
	public static void checkWinner(TTTBoard board, String plyr) {
		if ((board.getPosition(0,0).equals(plyr) && board.getPosition(1,1).equals(plyr) && board.getPosition(2,2).equals(plyr))
		 || (board.getPosition(0,2).equals(plyr) && board.getPosition(1,1).equals(plyr) && board.getPosition(2,0).equals(plyr))
		 || (board.getPosition(0,0).equals(plyr) && board.getPosition(1,0).equals(plyr) && board.getPosition(2,0).equals(plyr))
		 || (board.getPosition(0,1).equals(plyr) && board.getPosition(1,1).equals(plyr) && board.getPosition(2,1).equals(plyr))
		 || (board.getPosition(0,2).equals(plyr) && board.getPosition(1,2).equals(plyr) && board.getPosition(2,2).equals(plyr))
		 || (board.getPosition(0,0).equals(plyr) && board.getPosition(0,1).equals(plyr) && board.getPosition(0,2).equals(plyr))
		 || (board.getPosition(1,0).equals(plyr) && board.getPosition(1,1).equals(plyr) && board.getPosition(1,2).equals(plyr))
		 || (board.getPosition(2,0).equals(plyr) && board.getPosition(2,1).equals(plyr) && board.getPosition(2,2).equals(plyr))) {
			win = true;
			System.out.println("Player " + plyr + " wins!");
		}
		
	}

}
