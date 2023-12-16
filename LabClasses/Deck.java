package LabClasses;

import java.util.List;
import java.util.ArrayList;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private String[] suits = {"Club", "Spade", "Heart", "Diamond"};
	
	public Deck() {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				//Card(String name, String suit, int value)
				this.cards.add(new Card(this.cardNames[j-2],this.suits[i],j));
			}
		}
	}
	
	public void describe() {
		int i = 14;
		int j = 0;
		for (Card card : this.cards) {
			if (i % 14 == 0 && card.getName().equals("Two")) {
				System.out.println(this.suits[j] + ": ");
				i += 14;
				j++;
			}
			card.describe();
			if (card.getValue() == 14) {
				System.out.println();
			}
		}
	}
	
}
