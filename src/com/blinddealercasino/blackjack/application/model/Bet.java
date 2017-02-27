package com.blinddealercasino.blackjack.application.model;



/** 
 * Klasa abstrakcyjna, kt�ra stanowi podstaw� obstawiania przez gracza poszczeg�lnych zak�ad�w.
 * Stanowi baz�, z metod kt�rej korzystaj� wszystkie potomne klasy zak�ad�w.
 * 
 * 
 * 
 * 
 * @author Piotr Baczy�ski-Kaczmarek
 * 
 */


public class Bet {

	private int oneChipValue;
	private int totalBet;
	private int previousTotalBet;
	
	public void setOneChipValue(int s) {
		oneChipValue = s;
		totalBet = totalBet + oneChipValue;
		previousTotalBet = totalBet;
	}

	public void setTotalBet(int k) {
		totalBet = k;

	}

	public int getTotalBet() {
		return totalBet;
	}
	
	public void rebetTotalBet(int k){
		totalBet = k;
		previousTotalBet = totalBet;
		
	}
	
	public void rebet2xTotalBet(int k){
		totalBet = k;
		previousTotalBet = totalBet;
		
	}

	public void zeroPreviousBet(){
		if (totalBet == 0){
		previousTotalBet = 0;
		
		}
	}
	
	public int getPreviousBet(){
		return previousTotalBet;
	}
}
