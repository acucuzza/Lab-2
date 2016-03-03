package PokerEnums;

public enum eHandStrength {
	RoyalFlush(100, "RoyalFlush"),
	StraightFlush(90, "StraightFlush"),
	FourOfAKind(80, "FourOfAKind"),
	FullHouse(70, "FullHouse"),
	Flush(60, "Flush"),
	Straight(50, "Straight"),
	ThreeOfAKind(40, "ThreeOfAKind"),
	TwoPair(30, "TwoPair"),
	OnePair(20, "OnePair"),
	HighCard(10, "HighCard")
	;
	
	private int HandStrength;
	private String HandTitle;

	private eHandStrength(int HandStrength, String HandTitle) {
		this.HandStrength = HandStrength;
		this.HandTitle = HandTitle;
	}
 
	public void HandDetails() {
		switch (HandStrength) {
		case 10:
			System.out.println("You Don't Have any Pairs.");
			break;
 
		case 20:
			System.out.println("You Have One Pair.");
			break;
 
		case 30:
			System.out.println("You Have Two Pair.");
			break;
 
		case 40:
			System.out.println("You Have Three of A Kind.");
			break;
 
		case 50:
			System.out.println("You Have a Straight.");
			break;
			
		case 60:
			System.out.println("You Have a Flush.");
			break;
			
		case 70:
			System.out.println("You Have a Full House.");
			break;
			
		case 80:
			System.out.println("You Have Four of a Kind.");
			break;
			
		case 90:
			System.out.println("You Have a Straight Flush.");
			break;
			
		case 100:
			System.out.println("You Have a Royal Flush.");
			break;
		}
	}
}
