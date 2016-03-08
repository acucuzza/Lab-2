package base;
import java.util.ArrayList;
public class HandScore {
	
	//Create variables for hand strength.
	
	public ArrayList <Card> Kicker = new ArrayList<Card>();
	public int Strength;
	public int HighHand;
	public int LowHand;
	
	//Overloading
	public HandScore(){	
	}
	
	//Generate Constructor
	public HandScore(int strength, int highHand, int lowHand, ArrayList<Card> kicker) {
		super();
		Kicker = kicker;
		Strength = strength;
		HighHand = highHand;
		LowHand = lowHand;
	}

	//Generate Getters and Setters.
	public ArrayList<Card> getKicker() {
		return Kicker;
	}

	public void setKicker(ArrayList<Card> kicker) {
		Kicker = kicker;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
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
}
