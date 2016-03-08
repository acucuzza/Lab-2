package base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import PokerEnums.eRank;
import PokerEnums.eSuit;
import PokerEnums.eHandStrength;
import base.Card;
//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Hand extends Deck{
	
	ArrayList <Card> Hand = new ArrayList<Card>();
	
	// This method is calling the Draw function from Deck to get five cards.
	public Hand(ArrayList <Card> hand){
		for(int counter = 0; counter < 5; counter++){
			hand.add(Draw());
		}	
	}
	//This method is to be completed, but as of now will return true if there is a straight involving an Ace
	public boolean isStraight(){
		if (Hand.size() != 5){
			return false;
		}
		else if (isAceStraight()){
			return true;
		}
		else if (Hand.get(0).geteRank() == eRank.Ace && Hand.get(1).geteRank() == eRank.Five && Hand.get(2).geteRank() == eRank.Four && Hand.get(3).geteRank() == eRank.Three && Hand.get(4).geteRank() == eRank.Two){
			return true;
		}
		else {
			
		}
		return false;
	}
	
	// This method will return true if the hand is a Ace High Straight
	public boolean isAceStraight(){
		if (Hand.size() != 5){
			return false;
		}
		else if (Hand.get(0).geteRank() == eRank.Ace && Hand.get(1).geteRank() == eRank.King && Hand.get(2).geteRank() == eRank.Queen && Hand.get(3).geteRank() == eRank.Jack && Hand.get(4).geteRank() == eRank.Ten){
			return true;
		}
		return false;
	}
	// This method will return true if the hand is a Flush
	public boolean isFlush(){
		if (Hand.size() != 5){
			return false;
		}
		else if (Hand.get(0).geteSuit() == Hand.get(1).geteSuit() && Hand.get(0).geteSuit() == Hand.get(2).geteSuit() && Hand.get(0).geteSuit() == Hand.get(3).geteSuit() && Hand.get(0).geteSuit() == Hand.get(4).geteSuit()){
			return true;
		}
		return false;
	}
	// This will return true if the hand is a Royal Flush
	public boolean isRoyalFlush(){
		if (Hand.size() != 5){
			return false;
		}
		else if (isFlush() && isAceStraight()){
			return true;
		}
		return false;
	}
	
	   // This function will sort the hand by the rank of the card 
	public static Comparator<Card> CardRank = new Comparator<Card>() {
		public int compare(Card card1, Card card2) {

			PokerEnums.eRank cardRank1 = card1.geteRank();
			PokerEnums.eRank cardRank2 = card2.geteRank();

		   return cardRank2.ordinal()-cardRank1.ordinal();
	   }};
	   // This function will sort the hand by the suit of the card 
   public static Comparator<Card> CardSuit = new Comparator<Card>() {
		public int compare(Card card1, Card card2) {
		PokerEnums.eSuit cardSuit1 = card1.geteSuit();
		PokerEnums.eSuit cardSuit2 = card2.geteSuit();
		   return cardSuit2.ordinal()-cardSuit1.ordinal();
	   }};
}

