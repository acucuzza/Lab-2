package base;

import java.util.ArrayList;
import java.util.Collections;
import PokerEnums.eRank;
import PokerEnums.eHandStrength;
import PokerEnums.eSuit;

@SuppressWarnings("unused")
public class Deck {
	// Create ArrayList
	public ArrayList<Card> totalDeck = new ArrayList<Card>();
	
	// Build Deck
	public Deck() {
		int NumberInDeck = 1;
		for (eRank rank : eRank.values()) {
			for (eSuit suit : eSuit.values()) {
				if (rank != eRank.Joker) {
					if (suit != eSuit.Joker) {
						Card x = new Card(suit, rank, NumberInDeck++);
						totalDeck.add(x);
					}
				}
			}
		}
		Collections.shuffle(totalDeck);
	}
	
	// Method to Draw Card. If deck == 0 then creates new deck.
	public Card Draw(){
		if(totalDeck.size() == 0){
			int NumberInDeck = 1;
			for (eRank rank : eRank.values()) {
				for (eSuit suit : eSuit.values()) {
					if (rank != eRank.Joker) {
						if (suit != eSuit.Joker) {
							Card x = new Card(suit, rank, NumberInDeck++);
							totalDeck.add(x);
						}
					}
				}
			}
			Collections.shuffle(totalDeck);
			return totalDeck.remove(0);
		}					
		else{
			return totalDeck.remove(0);
			}
		}
	
	//Method to check remaining size of deck.
	public int Remaining() {
		return totalDeck.size();
	}
}
