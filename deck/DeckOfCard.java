package deck;

import java.util.Random;

public class DeckOfCard {
	int[][] card = new int[4][13];
	String suit;
	String rank;
	int suitnumber;
	int ranknumber;
	
	void allotCards(int playerNumber) {
		for (int i = 0; i < 9; i++) {
			allotOneCard(playerNumber);
		}
	}
	void allotOneCard(int playerNumber) {
		Random random = new Random();

		int suit = random.nextInt(4);
		int rank = random.nextInt(13);

		if (card[suit][rank] != 0) {
			allotOneCard(playerNumber);
		} else {
			card[suit][rank] = playerNumber;
		}
	}
	void print(int playerNumber) {
		for(int suit = 0; suit < 4; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				if(card[suit][rank] == playerNumber) {
					System.out.print(setSuit(suit) + "-" + setRank(rank) + ", ");
				}
			}
		}
		System.out.println("\n");
	}

	String setRank(int ranknumber) {
		switch (ranknumber) {
		case 0:
			return "2";

		case 1:
			return "3";

		case 2:
			return "4";

		case 3:
			return "5";

		case 4:
			return "6";

		case 5:
			return "7";
		case 6:
			return "8";

		case 7:
			return "9";

		case 8:
			return "10";

		case 9:
			return "jack";

		case 10:
			return "queen";

		case 11:
			return "ace";

		case 12:
			return "king";

		}
		return "";

	}

	String setSuit(int suitnumber) {
		switch (suitnumber) {
		case 0:
			return "Clubs";
		case 1:
			return "Spades";
		case 2:
			return "Hearts";
		case 3:
			return "Diamonds";
		}
		return "";

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Deck of cards");
		DeckOfCard deck = new DeckOfCard();

		for (int player = 1; player <= 4; player++) {
			deck.allotCards(player);
			System.out.println("Player "  + player + "'s cards:");
			deck.print(player);
		}

	}

}
