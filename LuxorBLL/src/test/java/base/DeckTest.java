package base;
import base.Deck;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PokerEnums.eRank;
import PokerEnums.eSuit;

@SuppressWarnings("unused")
public class DeckTest {

	public ArrayList<Card> totalDeck = new ArrayList<Card>();
	Deck NewDeck = new Deck();
	
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
	public void testDeckSize() {
		assertTrue(NewDeck.totalDeck.size() == 52);
	}
	//Test card draw and remaining card count.
	@Test
	public void testDrawRemaining() {
		assertTrue(NewDeck.totalDeck.get(0) == NewDeck.Draw());
		assertTrue(NewDeck.Remaining() == 51);
	}
	
	//Testing deck creation and redrawing if deck == 0.
	@Test
	public void testDrawWith0() {
		NewDeck.totalDeck.clear();
		NewDeck.Draw();
		assertTrue(NewDeck.Remaining() == 51);
		assertTrue(NewDeck.totalDeck.get(0)== NewDeck.Draw());
	}
}