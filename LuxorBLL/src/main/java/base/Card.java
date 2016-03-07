package base;

import PokerEnums.eRank;
import PokerEnums.eSuit;

public class Card {
	// initialize private attributes
	private eRank eRank;
	private eSuit eSuit;
	//constructor for card
	public Card(PokerEnums.eSuit eSuit, PokerEnums.eRank eRank) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	//getters
	public eRank geteRank() {
		return eRank;
	}
	public eSuit geteSuit() {
		return eSuit;
	}
}
