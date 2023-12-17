package LabClasses;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

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
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Set<Card> cards = new HashSet<Card>();
		
		for (Card card : this.cards) {
			cards.add(card);
		}
		
		this.cards.clear();
		
		for (Card card : cards) {
			this.cards.add(card);
		}		
	}
	
	public Card draw() {
		Card result = cards.get(cards.size() - 1);
		cards.remove(cards.size() - 1);
		return result;		
	}
	
	public void empty() {
		this.cards.clear();
	}
	
}
