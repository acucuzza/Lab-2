package base;

import PokerEnums.eRank;
import PokerEnums.eSuit;

public class Card {
	// initialize private attributes
	private eRank eRank;
	private eSuit eSuit;
	private int NumberInDeck;
	
	//constructor for card
	public Card(PokerEnums.eSuit eSuit, PokerEnums.eRank eRank, int NumberInDeck) {
		this.eRank = eRank;
		this.eSuit = eSuit;
		this.NumberInDeck = NumberInDeck;
	}
	//getters
	public eRank geteRank() {
		return eRank;
	}
	public eSuit geteSuit() {
		return eSuit;
	}
	public int getNumberInDeck() {
		return NumberInDeck;
	}
}
