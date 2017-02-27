package com.blinddealercasino.blackjack.application.controllers;



import java.io.IOException;
import java.net.URL;

import com.blinddealercasino.blackjack.application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MainMenuController {
	
	@FXML
	Button btnBlackjack;
	
	@FXML 
	Button btnRoulette;
	
	@FXML
	Button btnPoker;
	
	@FXML
	BorderPane borderPaneMainMenu;
	
	
	public void btnBlackjackClicked(ActionEvent event) throws IOException{
		URL blackjackUrl = getClass().getResource("/com/blinddealercasino/blackjack/application/Blackjack.fxml");
		BorderPane blackjack = FXMLLoader.load(blackjackUrl);
		Main.getRoot().setCenter(blackjack);


	}
	
	public void btnRouletteClicked(ActionEvent event){
		
	}
	
	public void btnPokerClicked(ActionEvent event){
		
	}
}

