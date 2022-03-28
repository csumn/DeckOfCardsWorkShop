package com.bridgelabz;

public class Main{
	public static void main(String[] args) {
		System.out.println("---Welcome to Deck Of Cards Game---");
		
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.getUniqueCards();
		System.out.println("****Cards are****");
		deckOfCards.displayArray(DeckOfCards.deckOfCard);
		deckOfCards.numOfPlayers();
		System.out.println(DeckOfCards.playerList);
	}
}