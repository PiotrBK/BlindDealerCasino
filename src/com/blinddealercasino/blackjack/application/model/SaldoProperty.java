package com.blinddealercasino.blackjack.application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SaldoProperty {

	private IntegerProperty saldoProperty;
	
	//constructor for the ChipValueProperty
	
	public SaldoProperty(int saldo){
		saldoProperty = new SimpleIntegerProperty(saldo); 
		
		
	}
	
	//getter and setter for the IntegerProperty
	public IntegerProperty getSaldoProperty() {
		return saldoProperty;
	}


	public void setSaldoValue(IntegerProperty saldoProperty) {
		this.saldoProperty = saldoProperty;
	}

	//getter and setter for IntegerProperty values
	
	public void setSaldo(int value){
		saldoProperty.set(value);
		
	}
	
	public int getSaldo(){
		return saldoProperty.getValue();
	}
}
