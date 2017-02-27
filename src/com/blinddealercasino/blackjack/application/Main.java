package com.blinddealercasino.blackjack.application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class Main extends Application {
	
	
	//Creating a static root to pass to the controller
	private static BorderPane root = new BorderPane();


	/**
	 * Just a root getter for the controller to use
	*/
	public static BorderPane getRoot() {
	    return root;
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
	  
		

	    URL mainMenuUrl = getClass().getResource("MainMenu.fxml");
	    BorderPane mainMenu = FXMLLoader.load(mainMenuUrl);
	    
	
	    root.setCenter(mainMenu);
	    
	    Scene scene = new Scene(root, 1200, 905);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
