package com.blinddealercasino.blackjack.application.model;



/** 
 * Klasa abstrakcyjna, która stanowi podstawê obstawiania przez gracza poszczególnych zak³adów.
 * Stanowi bazê, z metod której korzystaj¹ wszystkie potomne klasy zak³adów.
 * 
 * 
 * 
 * 
 * @author Piotr Baczyñski-Kaczmarek
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
