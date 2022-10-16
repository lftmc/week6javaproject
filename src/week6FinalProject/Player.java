package week6FinalProject;

import java.util.ArrayList;

public class Player {
	
	private	ArrayList <Card> hand = new ArrayList<>();
	private int score = 0;
	private String name; 
	
	public int getScore() {
		return this.score;
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	
	
	public void describe( boolean displayHand) {
		System.out.println("Player " + name + "  Score:" +score);
		//I want to be able to call this method to display names and scores without always displaying the full hands
		if(displayHand == true) {
				System.out.println("Cards in hand:");
				for (Card card : this.hand) {
					card.describe();
				}
		}
	}
	public Card flip () {
		Card flipCard = new Card();
		flipCard = this.hand.get(0);
		this.hand.remove(0);
		return flipCard;
	}
	
	public void draw (Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void incrementScore () {
		this.score = this.score + 1;
		System.out.println(this.name +" wins the round and gained 1 point!");
	}
	
	
}
