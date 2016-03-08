package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PokerEnums.eRank;
import PokerEnums.eSuit;

public class CardTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetters() {
		Card card = new Card(eSuit.Clubs , eRank.Four, 4);
		assertTrue(card.geteRank() == eRank.Four);
		assertTrue(card.geteSuit() == eSuit.Clubs);
		assertTrue(card.getNumberInDeck() == 4);
	}
	

}