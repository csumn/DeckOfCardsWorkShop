package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards{
	static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	static String[] deckOfCard = new String[suit.length * rank.length];
	public static ArrayList<Player> playerList = new ArrayList<>();

	Scanner scanner =  new Scanner(System.in);
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

	public void numOfPlayers() {
		System.out.println("Enter the number of players must be between 2 to 4 ");
		int playerCount = scanner.nextInt();
		if (playerCount >= 2 && playerCount <= 4) {

			for(int i =0;i<playerCount;i++){
				System.out.println("Enter player "+(i+1)+" name");
				String name = scanner.next();
				int playerNo = (i+1);
				playerList.add(new Player(name,playerNo));
			}
			System.out.println(playerCount + " players will play the game");
		} else {
			System.out.println("Invalid Number of Players .....");
			numOfPlayers();
		}
	}
}