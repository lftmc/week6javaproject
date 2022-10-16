package week6FinalProject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList <Card> cards = new ArrayList<>();
	public Deck() {
		//here we're iterating to create the number cards in each suit
		int i = 2;
		while (i < 11) {
			
			this.cards.add(new Card((i),addSuit(i, "Hearts")));
			this.cards.add(new Card((i),addSuit(i, "Clubs")));
			this.cards.add(new Card((i),addSuit(i, "Spades")));
			this.cards.add(new Card((i),addSuit(i, "Diamonds")));
			i++;
		}
		//using an enhanced for loop to create a set of face cards in each suit
			
		String[] ofSuits = new String[4];
		ofSuits[0] = "of Hearts";
		ofSuits[1] = "of Clubs";
		ofSuits[2] = "of Spades";
		ofSuits[3] = "of Diamonds";
				
		for (String suit : ofSuits) {
				this.cards.add(new Card(11 , ("Jack " + suit)));
				this.cards.add(new Card(12 , ("Queen " + suit)));
				this.cards.add(new Card(13 , ("King " + suit)));
				this.cards.add(new Card(14 , ("Ace " + suit)));
				}
						
	}
	

	
	public void shuffle() {
		Collections.shuffle(this.cards);
		
	}
	
	public String addSuit(int suitValue, String suit) {
		
		String cardName = suitValue + " of " + suit;
		return cardName;
		
	}
	
	public Card draw () {
		Card drawnCard = new Card();
		drawnCard = this.cards.get(0);
		this.cards.remove(0);
		return drawnCard;
	
		
	}

}
