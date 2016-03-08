package base;

import PokerEnums.eRank;
import PokerEnums.eSuit;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Card implements Comparable{
	
	public Card(){}
	
	// initialize private attributes
	private eRank eRank;
	private eSuit eSuit;
	private int NumberInDeck;
	
	//constructor for card
	public Card(PokerEnums.eSuit eSuit, PokerEnums.eRank eRank, int NumberInDeck) {
		super();
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
	
	public static Comparator<Card> CardRank = new Comparator<Card>(){
		public int compare(Card x1, Card x2){
			int Card1 = x1.geteRank().getNumberInDeck();
			int Card2 = x1.geteRank().getNumberInDeck();
			return Card2 - Card1;
		}
	};
	public int compareTo(Object O) {
		Card x = (Card) O;
		return x.geteRank().compareTo(this.geteRank());
	}
}
