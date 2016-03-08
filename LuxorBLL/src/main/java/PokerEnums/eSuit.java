package PokerEnums;

public enum eSuit {
	/**
	 * 
	 * 
	 * 
	 */
	Spades(0),
	Diamonds(1),
	Hearts(2),
	Clubs(3),
	Joker(4)
	;
	
	private int suitValue;
	
	private eSuit(int value){
		suitValue = value;
	}
	public int getValue(){
		return suitValue;
	}
}
