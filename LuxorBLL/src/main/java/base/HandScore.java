package base;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import PokerEnums.eHandStrength;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
public class HandScore{
	
	//Create variables for hand strength.
	ArrayList <Card> Kicker = new ArrayList<Card>();
	private eHandStrength HandStrength;
	int HighHand;
	int LowHand;
	
	//Overloading
	public HandScore(){	
	}
	
	//Generate Constructor
	public HandScore(PokerEnums.eHandStrength handStrength, int highHand, int lowHand, ArrayList<Card> kicker) {
		super();
		Kicker = kicker;
		HandStrength = handStrength;
		HighHand = highHand;
		LowHand = lowHand;
	}

	public ArrayList<Card> getKicker() {
		return Kicker;
	}
	
	public void setKicker(ArrayList<Card> kicker) {
		Kicker = kicker;
	}

	public PokerEnums.eHandStrength getStrength() {
		return HandStrength;
	}

	public void setStrength(PokerEnums.eHandStrength handStrength) {
		HandStrength = handStrength;
	}

	public int getHighHand() {
		return HighHand;
	}

	public void setHighHand(int highHand) {
		HighHand = highHand;
	}

	public int getLowHand() {
		return LowHand;
	}

	public void setLowHand(int lowHand) {
		LowHand = lowHand;
	}
	
	public PokerEnums.eHandStrength testHand(){
		return HandStrength;
	}
	
}
