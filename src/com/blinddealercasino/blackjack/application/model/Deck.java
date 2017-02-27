package com.blinddealercasino.blackjack.application.model;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public Deck(){
		String imageFolder = "/com/blinddealercasino/blackjack/application/img/";
		cards.add(new Card("AceOfSpades", new Image(imageFolder + "ace_of_spades2.png"), 11));
		cards.add(new Card("TwoOfSpades", new Image(imageFolder + "2_of_spades.png"), 2));
		cards.add(new Card("ThreeOfSpades", new Image(imageFolder + "3_of_spades.png"), 3));
		cards.add(new Card("FourOfSpades", new Image(imageFolder + "4_of_spades.png"), 4));
		cards.add(new Card("FiveOfSpades", new Image(imageFolder + "5_of_spades.png"), 5));
		cards.add(new Card("SixOfSpades", new Image(imageFolder + "6_of_spades.png"), 6));
		cards.add(new Card("SevenOfSpades", new Image(imageFolder + "7_of_spades.png"), 7));
		cards.add(new Card("EightOfSpades", new Image(imageFolder + "8_of_spades.png"), 8));
		cards.add(new Card("NineOfSpades", new Image(imageFolder + "9_of_spades.png"), 9));
		cards.add(new Card("TenOfSpades", new Image(imageFolder + "10_of_spades.png"), 10));
		cards.add(new Card("JackOfSpades", new Image(imageFolder + "jack_of_spades2.png"), 10));
		cards.add(new Card("QueenOfSpades", new Image(imageFolder + "queen_of_spades2.png"), 10));
		cards.add(new Card("FourOfSpades", new Image(imageFolder + "king_of_spades2.png"), 10));
		cards.add(new Card("AceOfHearts", new Image(imageFolder + "ace_of_hearts.png"), 11));
		cards.add(new Card("TwoOfHearts", new Image(imageFolder + "2_of_hearts.png"), 2));
		cards.add(new Card("ThreeOfHearts", new Image(imageFolder + "3_of_hearts.png"), 3));
		cards.add(new Card("FourOfHearts", new Image(imageFolder + "4_of_hearts.png"), 4));
		cards.add(new Card("FiveOfHearts", new Image(imageFolder + "5_of_hearts.png"), 5));
		cards.add(new Card("SixOfHearts", new Image(imageFolder + "6_of_hearts.png"), 6));
		cards.add(new Card("SevenOfHearts", new Image(imageFolder + "7_of_hearts.png"), 7));
		cards.add(new Card("EightOfHearts", new Image(imageFolder + "8_of_hearts.png"), 8));
		cards.add(new Card("NineOfHearts", new Image(imageFolder + "9_of_hearts.png"), 9));
		cards.add(new Card("TenOfHearts", new Image(imageFolder + "10_of_hearts.png"), 10));
		cards.add(new Card("JackOfHearts", new Image(imageFolder + "jack_of_hearts2.png"), 10));
		cards.add(new Card("QueenOfHearts", new Image(imageFolder + "queen_of_hearts2.png"), 10));
		cards.add(new Card("KingOfHearts", new Image(imageFolder + "king_of_hearts2.png"), 10));
		cards.add(new Card("AceOfClubs", new Image(imageFolder + "ace_of_clubs.png"), 11));
		cards.add(new Card("TwoOfClubs", new Image(imageFolder + "2_of_clubs.png"), 2));
		cards.add(new Card("ThreeOfClubs", new Image(imageFolder + "3_of_clubs.png"), 3));
		cards.add(new Card("FourOfClubs", new Image(imageFolder + "4_of_clubs.png"), 4));
		cards.add(new Card("FiveOfClubs", new Image(imageFolder + "5_of_clubs.png"), 5));
		cards.add(new Card("SixOfClubs", new Image(imageFolder + "6_of_clubs.png"), 6));
		cards.add(new Card("SevenOfClubs", new Image(imageFolder + "7_of_clubs.png"), 7));
		cards.add(new Card("EightOfClubs", new Image(imageFolder + "8_of_clubs.png"), 8));
		cards.add(new Card("NineOfClubs", new Image(imageFolder + "9_of_clubs.png"), 9));
		cards.add(new Card("TenOfClubs", new Image(imageFolder + "10_of_clubs.png"), 10));
		cards.add(new Card("JackOfClubs", new Image(imageFolder + "jack_of_clubs2.png"), 10));
		cards.add(new Card("QueenOfClubs", new Image(imageFolder + "queen_of_clubs2.png"), 10));
		cards.add(new Card("KingOfClubs", new Image(imageFolder + "king_of_clubs2.png"), 10));
		cards.add(new Card("AceOfDiamonds", new Image(imageFolder + "ace_of_diamonds.png"), 11));
		cards.add(new Card("TwoOfDiamonds", new Image(imageFolder + "2_of_diamonds.png"), 2));
		cards.add(new Card("ThreeOfDiamonds", new Image(imageFolder + "3_of_diamonds.png"), 3));
		cards.add(new Card("FourOfDiamonds", new Image(imageFolder + "4_of_diamonds.png"), 4));
		cards.add(new Card("FiveOfDiamonds", new Image(imageFolder + "5_of_diamonds.png"), 5));
		cards.add(new Card("SixOfDiamonds", new Image(imageFolder + "6_of_diamonds.png"), 6));
		cards.add(new Card("SevenOfDiamonds", new Image(imageFolder + "7_of_diamonds.png"), 7));
		cards.add(new Card("EightOfDiamonds", new Image(imageFolder + "8_of_diamonds.png"), 8));
		cards.add(new Card("NineOfDiamonds", new Image(imageFolder + "9_of_diamonds.png"), 9));
		cards.add(new Card("TenOfDiamonds", new Image(imageFolder + "10_of_diamonds.png"), 10));
		cards.add(new Card("JackOfDiamonds", new Image(imageFolder + "jack_of_diamonds2.png"), 10));
		cards.add(new Card("QueenOfDiamonds", new Image(imageFolder + "queen_of_diamonds2.png"), 10));
		cards.add(new Card("KingOfDiamonds", new Image(imageFolder + "king_of_diamonds2.png"), 10));
	}
	
}
