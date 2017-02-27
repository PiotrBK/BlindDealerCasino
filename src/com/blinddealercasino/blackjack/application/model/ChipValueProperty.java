package com.blinddealercasino.blackjack.application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;


public class ChipValueProperty {

	private IntegerProperty chipValue;
	
	//constructor for the ChipValueProperty
	
	public ChipValueProperty(int chip){
		chipValue = new SimpleIntegerProperty(chip); 
		
		
	}
	
	//getter and setter for the IntegerProperty
	public IntegerProperty getChipValue() {
		return chipValue;
	}


	public void setChipValue(IntegerProperty chipValue) {
		this.chipValue = chipValue;
	}

	//getter and setter for IntegerProperty values
	
	public void setValue(int value){
		chipValue.set(value);
		
	}
	
	public int getValue(){
		return chipValue.getValue();
	}
}
