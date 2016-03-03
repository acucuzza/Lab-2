package PokerEnums;

public enum eRank {
	/**
	* 
	*
	*/
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13),
	Ace(14),
	;
	private int value;
	
	private eRank (int numericalValue){
		value = numericalValue;
	}
	public int getValue(){
		return value;
	}
}
