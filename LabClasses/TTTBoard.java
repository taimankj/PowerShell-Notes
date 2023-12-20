package LabClasses;

import java.util.*;

public class TTTBoard {
	
	private Map<Integer, String[]> board = new HashMap<Integer, String[]>();
	
	public TTTBoard() {
		String[] arr = {" ", " ", " "};
		String[] arr1 = {" ", " ", " "};
		String[] arr2 = {" ", " ", " "};
		board.put(0, arr);
		board.put(1, arr1);
		board.put(2, arr2);
	}
	
	public void describe() {
		System.out.println( "\t  0   1   2  "
			+ "\n\t+---+---+---+"
			+ "\n0 \t| " + board.get(0)[0]+ " | " + board.get(0)[1] + " | " + board.get(0)[2] + " |"
			+ "\n\t+---+---+---+"
			+ "\n1 \t| " + board.get(1)[0] + " | " + board.get(1)[1] + " | " + board.get(1)[2] + " |"
			+ "\n\t+---+---+---+"
			+ "\n2 \t| " + board.get(2)[0] + " | " + board.get(2)[1] + " | " + board.get(2)[2] + " |"
			+ "\n\t+---+---+---+");
	}
	
	public String getPosition(int row, int column) {
		return (String) board.get(row)[column];
	}
	
	public void setPosition(String plyr, int row, int column) {
		board.get(row)[column] = plyr;
		//board.get(row).remove(board.get(row).size() - 1);
	}
	
}
