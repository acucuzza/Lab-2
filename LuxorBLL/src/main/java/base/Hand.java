package base;

import java.util.ArrayList;
import java.util.Collections;
import PokerEnums.*;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.InvocationTargetException;


@SuppressWarnings("unused")
public class Hand extends Deck {
	private ArrayList<Card> CardsInHand;
	private ArrayList<Card> BestInHand;
	private HandScore HandScore;
	private boolean bScored = false;
	
	//Create Constructor
	public Hand() {
		BestInHand = new ArrayList<Card>();
		CardsInHand = new ArrayList<Card>();
		for(int i=CardsInHand.size(); i<5; i++ ){
			CardsInHand.add(Draw());	
			}
		}
	
	//Generate Getters and Setters
	public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		CardsInHand = cardsInHand;
	}

	public ArrayList<Card> getBestInHand() {
		return BestInHand;
	}

	public void setBestInHand(ArrayList<Card> bestInHand) {
		BestInHand = bestInHand;
	}

	public HandScore getHandScore() {
		return HandScore;
	}

	public void setHandScore(HandScore handScore) {
		HandScore = handScore;
	}

	public boolean isbScored() {
		return bScored;
	}

	public void setbScored(boolean bScored) {
		this.bScored = bScored;
	}
	
	public void AddCard(){
		if (CardsInHand.size() != 5){
			for(int i=CardsInHand.size(); i<5; i++ ){
				CardsInHand.add(Draw());
			}
		}
	}
	
	//Evaluation Method
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Hand Evaluate(Hand hand){
		Collections.sort(hand.getCardsInHand());
		HandScore HS = new HandScore();
		try{
			Class<?> n = Class.forName("base.Hand");
			for(eHandStrength str : eHandStrength.values()){
				Class[] Args = new Class[2];
				Args[0] = base.Hand.class;
				Args[1] = base.HandScore.class;
				
				Method method = n.getMethod(str.getEvaluation(), Args);
				Object o = method.invoke(null, new Object[] {hand,HS});
				
				if ((Boolean) o == true){
					break;
				}
			}
			hand.bScored = true;
			hand.HandScore = HS;
			
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return hand;
		}
}