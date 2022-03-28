package com.bridgelabz;

public class DeckOfCards{
	static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	static String[] deckOfCard = new String[suit.length * rank.length];

	public void getUniqueCards() {
		int index = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCard[index] = suit[i] + " : " + rank[j];
				index++;
			}
		}
	}
	public void displayArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}

