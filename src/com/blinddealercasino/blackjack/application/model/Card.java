package com.blinddealercasino.blackjack.application.model;

import javafx.scene.image.Image;

public class Card {

	private int cardValue;
	private Image cardImage;
	private String cardName;
	
	public Card(String cardName, Image cardImage, int cardValue){
		this.setCardName(cardName);
		this.setCardImage(cardImage);
		this.setCardValue(cardValue);
	}

	
	public int getCardValue() {
		return cardValue;
	}


	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}


	public Image getCardImage() {
		return cardImage;
	}


	public void setCardImage(Image cardImage) {
		this.cardImage = cardImage;
	}



	public String getCardName() {
		return cardName;
	}



	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
	
	
	
}
