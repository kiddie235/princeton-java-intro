public class CardDeckShuffle {
	
	public static void main(String[] args) {
		//card suit types and rank types
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

		//creating the 52 cards in a deck
		String[] deck = new String[suit.length * rank.length];
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[rank.length * i + j] = rank[j] + " of " + suit[i];
				System.out.println(deck[rank.length * i + j]);	
			}
		}

		//shuffling the deck
		System.out.println("------ printing shuffled deck ------");
		int N = deck.length;
		for (int i = 0; i < N; i++) {
			//generate random number btn i and last element in the array(N - 1)
			int r = i + (int) (Math.random() * (N-i));
			String temp = deck[i];
			deck[i] = deck[r];
			deck[r] = temp;
			System.out.println(deck[i]);
		}
	}
}