package week6FinalProject;

public class App {

	public static void main(String[] args) {
		
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		
		Player player1 = new Player("John");
		Player player2 = new Player("Fred");
		//opening- players draw all cards in the deck
		for (int i = 0;  i < 52; i++) {
			//using modulo 2 to alternate between players on each iteration while staying in one loop
			if (i % 2 == 0) {
				player1.draw(gameDeck);
			}
			if (i % 2 == 1) {
				player2.draw(gameDeck);
			}
		}
		
		System.out.println("The game is starting! Here are the opening hands:");
		
		player1.describe(true);
		System.out.println("______________________________________");
		player2.describe(true);
		
		//flipping cards for each round
		
		for (int round = 1; round < 27; round++) {
			System.out.println("********************************");
			System.out.println("Round:" +round);
			Card p1value = player1.flip();
			Card p2value = player2.flip();
			player1.describe(false);
			p1value.describe();
			player2.describe(false);
			p2value.describe();
			
			
			if (p1value.getValue() > p2value.getValue()) {
				player1.incrementScore();
			} else if (p1value.getValue() < p2value.getValue()) {
				player2.incrementScore();
			} else {
				System.out.println("A TIE! No points awarded this round");
			}
	
		}
		
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("GAME OVER");
		if (player1.getScore() > player2.getScore()) {
			player1.describe(false);
			System.out.println("Is the Winner");
			player2.describe(false); 
			System.out.println("Is the Loser");
		} else if (player1.getScore() < player2.getScore()) {
			player2.describe(false);
			System.out.println("Is the Winner");
			player1.describe(false); 
			System.out.println("Is the Loser");
		} else {
			player1.describe(false);
			player2.describe(false);
			System.out.println("We have a TIE");
		}
		
		
		
	}



}
