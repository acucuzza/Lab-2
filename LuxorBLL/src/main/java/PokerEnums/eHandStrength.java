package PokerEnums;

public enum eHandStrength {
	RoyalFlush(100, "RoyalFlush") {
		public String toString() {
			return "Royal Flush";
		}
	},
	StraightFlush(90, "StraightFlush") {
		public String toString() {
			return "Straight Flush";
		}
	},
	FourOfAKind(80, "FourOfAKind") {
		public String toString() {
			return "Four of a Kind";
		}
	},
	FullHouse(70, "FullHouse") {
		public String toString() {
			return "Full House";
		}
	},
	Flush(60, "Flush") {
		public String toString() {
			return "Flush";
		}
	},
	Straight(50, "Straight") {
		public String toString() {
			return "Straight";
		}
	},
	ThreeOfAKind(40, "ThreeOfAKind") {
		public String toString() {
			return "Three of a Kind";
		}
	},
	TwoPair(30, "TwoPair") {
		public String toString() {
			return "Two Pairs";
		}
	},

	Pair(20, "Pair") {
		public String toString() {
			return "One Pair";
		}
	},
	HighCard(10, "HighCard") {
		public String toString() {
			return "High Card";
		}
	};

	private eHandStrength(final int Strength, final String Type) {
		this.iStrength = Strength;
		this.strType = Type;
	}

	private int iStrength;
	private String strType;

	public int getHandStrength() {
		return iStrength;
	}

	public String getEvaluation() {
		return this.strType;
	}

}