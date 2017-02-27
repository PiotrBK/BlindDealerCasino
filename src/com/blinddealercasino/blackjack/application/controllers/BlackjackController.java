package com.blinddealercasino.blackjack.application.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import com.blinddealercasino.blackjack.application.model.Bet;
import com.blinddealercasino.blackjack.application.model.Card;
import com.blinddealercasino.blackjack.application.model.ChipValueProperty;
import com.blinddealercasino.blackjack.application.model.Deck;
import com.blinddealercasino.blackjack.application.model.SaldoProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;



public class BlackjackController implements Initializable {

	
	@FXML
	BorderPane borderPaneBlackjack;
	// declarations of all imageViews for cards
	@FXML
	ImageView dealerCard1;
	@FXML
	ImageView dealerCard2;	
	@FXML
	ImageView dealerCard3;	
	@FXML
	ImageView dealerCard4;	
	@FXML
	ImageView dealerCard5;
	@FXML
	ImageView dealerCard6;
	@FXML
	ImageView dealerCard7;
	@FXML
	ImageView dealerCard8;
	@FXML
	ImageView player1Card1;
	@FXML
	ImageView player1Card2;
	@FXML
	ImageView player1Card3;
	@FXML
	ImageView player1Card4;
	@FXML
	ImageView player1Card5;
	@FXML
	ImageView player1Card6;	
	@FXML
	ImageView player1Card7;
	@FXML
	ImageView player1Card8;
	@FXML
	ImageView player1Card9;
	@FXML
	ImageView player2Card1;
	@FXML
	ImageView player2Card2;	
	@FXML
	ImageView player2Card3;
	@FXML
	ImageView player2Card4;		
	@FXML
	ImageView player2Card5;
	@FXML
	ImageView player2Card6;	
	@FXML
	ImageView player2Card7;
	@FXML
	ImageView player2Card8;	
	@FXML
	ImageView player2Card9;
	@FXML
	ImageView player3Card1;		
	@FXML
	ImageView player3Card2;		
	@FXML
	ImageView player3Card3;		
	@FXML
	ImageView player3Card4;		
	@FXML
	ImageView player3Card5;		
	@FXML
	ImageView player3Card6;		
	@FXML
	ImageView player3Card7;		
	@FXML
	ImageView player3Card8;		
	@FXML
	ImageView player3Card9;
	@FXML
	ImageView player4Card1;		
	@FXML
	ImageView player4Card2;		
	@FXML
	ImageView player4Card3;	
	@FXML
	ImageView player4Card4;		
	@FXML
	ImageView player4Card5;		
	@FXML
	ImageView player4Card6;		
	@FXML
	ImageView player4Card7;		
	@FXML
	ImageView player4Card8;		
	@FXML
	ImageView player4Card9;
	@FXML
	ImageView player5Card1;		
	@FXML
	ImageView player5Card2;		
	@FXML
	ImageView player5Card3;	
	@FXML
	ImageView player5Card4;		
	@FXML
	ImageView player5Card5;		
	@FXML
	ImageView player5Card6;		
	@FXML
	ImageView player5Card7;		
	@FXML
	ImageView player5Card8;		
	@FXML
	ImageView player5Card9;	
	@FXML
	Label lblDealerTotal;
	@FXML
	Label lblPlayer1Total;
	@FXML
	Label lblPlayer2Total;
	@FXML
	Label lblPlayer3Total;	
	@FXML
	Label lblPlayer4Total;
	@FXML
	Label lblPlayer5Total;
	@FXML
	ImageView imvBetPlayer1;
	@FXML
	ImageView imvBetPlayer2;
	@FXML
	ImageView imvBetPlayer3;
	@FXML
	ImageView imvBetPlayer4;
	@FXML
	ImageView imvBetPlayer5;
	@FXML
	Button btnBetPlayer1;
	@FXML
	Button btnBetPlayer2;
	@FXML
	Button btnBetPlayer3;
	@FXML
	Button btnBetPlayer4;
	@FXML
	Button btnBetPlayer5;
	@FXML
	Label lblChipValue;
	@FXML
	Button btnChipValue10;
	@FXML
	Button btnChipValue20;
	@FXML
	Button btnChipValue50;
	@FXML
	Button btnChipValue100;
	@FXML
	Button btnChipValue500;
	@FXML 
	Button btnHitPlayer1;
	@FXML
	Button btnHitPlayer2;
	@FXML
	Button btnHitPlayer3;
	@FXML
	Button btnHitPlayer4;
	@FXML
	Button btnHitPlayer5;
	@FXML
	Button btnStayPlayer1;
	@FXML
	Button btnStayPlayer2;
	@FXML
	Button btnStayPlayer3;
	@FXML
	Button btnStayPlayer4;
	@FXML
	Button btnStayPlayer5;
	@FXML
	Label lblSaldo;
	@FXML 
	Button btnDeal;
	@FXML 
	Button btnNewGame;
	
	private SaldoProperty saldo;
	private ChipValueProperty chipValue;	
	private boolean flagPlayer1bet;
	private boolean flagPlayer2bet;
	private boolean flagPlayer3bet;
	private boolean flagPlayer4bet;
	private boolean flagPlayer5bet;
	private boolean haveMoney;
	private Bet betPlayer1;
	private Bet betPlayer2;
	private Bet betPlayer3;
	private Bet betPlayer4;
	private Bet betPlayer5;	
	private Deck deck1;
	private ArrayList<Card> shuffledDecks;
	private ArrayList<Card> allCards;
	private int player1TotalCount = 0;
	private int player2TotalCount = 0;
	private int player3TotalCount = 0;
	private int player4TotalCount = 0;
	private int player5TotalCount = 0;
	private int dealerTotalCount = 0;
	private int player1CardCount = 2;
	private int player2CardCount = 2;
	private int player3CardCount = 2;
	private int player4CardCount = 2;
	private int player5CardCount = 2;
	private int player1Aces = 0;
	private int player2Aces = 0;
	private int player3Aces = 0;
	private int player4Aces = 0;
	private int player5Aces = 0;
	private int dealerAces = 0;
	private int dealerCardCount = 1;
	private Image imgBet = new Image("/com/blinddealercasino/blackjack/application/img/bet.png");
	
	public void btnChipValueClicked(ActionEvent event){
		
		Button button = (Button) event.getSource();
		if(button.equals(btnChipValue10))
			chipValue.setValue(10);
		if(button.equals(btnChipValue20))
			chipValue.setValue(20);
		if(button.equals(btnChipValue50))
			chipValue.setValue(50);
		if(button.equals(btnChipValue100))
			chipValue.setValue(100);
		if(button.equals(btnChipValue500))
			chipValue.setValue(500);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btnNewGame.setDisable(true);
		chipValue = new ChipValueProperty(10);
		chipValue.getChipValue().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				lblChipValue.setText("Chip value: " + (new Integer(chipValue.getValue())).toString() + " zl");
				
			}
		});
		
		
		deck1 = new Deck();
		allCards = new ArrayList<Card>(312);
		
		betPlayer1 = new Bet();
		betPlayer2 = new Bet();
		betPlayer3 = new Bet();
		betPlayer4 = new Bet();
		betPlayer5 = new Bet();
		btnHitPlayer1.setDisable(true);
		btnHitPlayer2.setDisable(true);
		btnHitPlayer3.setDisable(true);
		btnHitPlayer4.setDisable(true);
		btnHitPlayer5.setDisable(true);
		btnStayPlayer1.setDisable(true);
		btnStayPlayer2.setDisable(true);
		btnStayPlayer3.setDisable(true);
		btnStayPlayer4.setDisable(true);
		btnStayPlayer5.setDisable(true);
		
		
		saldo = new SaldoProperty(1500);
		saldo.getSaldoProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				lblSaldo.setText(new Integer(saldo.getSaldo()).toString());
				
			}
		});
		shuffleDecks();

	}

	public void btnBetClicked(ActionEvent event) throws IOException{
		
		Button button = (Button) event.getSource();
		
		if(button.equals(btnBetPlayer1)){
			
			haveMoney = checkSaldo(chipValue.getValue());
	
			if(haveMoney == true){
		
				int differenceOverMaximum = 0;
				int betImageValue = 0;
				
				betPlayer1.setOneChipValue(chipValue.getValue());
				int betValue = betPlayer1.getTotalBet();
				
				if(betValue == 10){
					betImageValue = 10;
				}
				if(betValue > 10 && betValue <50){
					betImageValue = 20;
				}
				if(betValue >= 50 && betValue < 100){
					betImageValue = 50;
				}
				if(betValue >= 100 && betValue <500){
					betImageValue = 100;
				}
				if(betValue == 500){
					betImageValue = 500;
				}
				if(betValue > 500){
					
					betImageValue = 500;
				
					differenceOverMaximum = overMaximum(betPlayer1);
					
					
				}
				String betImageName = ("/com/blinddealercasino/blackjack/application/img/bet3d" + Integer.toString(betImageValue) + "zl.png");
				imvBetPlayer1.setImage(new Image(betImageName));
				flagPlayer1bet = true;								
				updateSaldo(chipValue.getValue() + differenceOverMaximum);
				
			}else{
				Alert noMoney = new Alert(AlertType.NONE, "You don't have enough money!", ButtonType.OK);
				noMoney.setTitle("Error");
				noMoney.showAndWait();
			}
		}
		if(button.equals(btnBetPlayer2)){	
			
			haveMoney = checkSaldo(chipValue.getValue());
		
			if(haveMoney == true){
	
				int differenceOverMaximum = 0;
				int betImageValue = 0;
			
				betPlayer2.setOneChipValue(chipValue.getValue());
				int betValue = betPlayer2.getTotalBet();
			
				if(betValue == 10){
					betImageValue = 10;
				}
				if(betValue > 10 && betValue <50){
					betImageValue = 20;
				}
				if(betValue >= 50 && betValue < 100){
					betImageValue = 50;
				}
				if(betValue >= 100 && betValue <500){
					betImageValue = 100;
				}
				if(betValue == 500){
					betImageValue = 500;
				}
				if(betValue > 500){
				
					betImageValue = 500;
					differenceOverMaximum = overMaximum(betPlayer2);
				
					
				}
				
				String betImageName = ("/com/blinddealercasino/blackjack/application/img/bet3d" + Integer.toString(betImageValue) + "zl.png");
				imvBetPlayer2.setImage(new Image(betImageName));
				flagPlayer2bet = true;								
				updateSaldo(chipValue.getValue() + differenceOverMaximum);
			
			}else{
				Alert noMoney = new Alert(AlertType.NONE, "You don't have enough money!", ButtonType.OK);
				noMoney.setTitle("Error");
				noMoney.showAndWait();
			}
		}
		
		if(button.equals(btnBetPlayer3)){
			
			haveMoney = checkSaldo(chipValue.getValue());
		
			if(haveMoney == true){
	
				int differenceOverMaximum = 0;
				int betImageValue = 0;
			
				betPlayer3.setOneChipValue(chipValue.getValue());
				int betValue = betPlayer3.getTotalBet();
			
				if(betValue == 10){
					betImageValue = 10;
				}
				if(betValue > 10 && betValue <50){
					betImageValue = 20;
				}
				if(betValue >= 50 && betValue < 100){
					betImageValue = 50;
				}
				if(betValue >= 100 && betValue <500){
					betImageValue = 100;
				}
				if(betValue == 500){
					betImageValue = 500;
				}
				if(betValue > 500){
				
					betImageValue = 500;
					differenceOverMaximum = overMaximum(betPlayer3);
				
					
				}
				
				String betImageName = ("/com/blinddealercasino/blackjack/application/img/bet3d" + Integer.toString(betImageValue) + "zl.png");
				imvBetPlayer3.setImage(new Image(betImageName));
				flagPlayer3bet = true;								
				updateSaldo(chipValue.getValue() + differenceOverMaximum);
			
			}else{
				Alert noMoney = new Alert(AlertType.NONE, "You don't have enough money!", ButtonType.OK);
				noMoney.setTitle("Error");
				noMoney.showAndWait();
			}
		}
		if(button.equals(btnBetPlayer4)){
			
			haveMoney = checkSaldo(chipValue.getValue());
		
			if(haveMoney == true){
	
				int differenceOverMaximum = 0;
				int betImageValue = 0;
			
				betPlayer4.setOneChipValue(chipValue.getValue());
				int betValue = betPlayer4.getTotalBet();
			
				if(betValue == 10){
					betImageValue = 10;
				}
				if(betValue > 10 && betValue <50){
					betImageValue = 20;
				}
				if(betValue >= 50 && betValue < 100){
					betImageValue = 50;
				}
				if(betValue >= 100 && betValue <500){
					betImageValue = 100;
				}
				if(betValue == 500){
					betImageValue = 500;
				}
				if(betValue > 500){
				
					betImageValue = 500;
					differenceOverMaximum = overMaximum(betPlayer4);
				
					
				}
				
				String betImageName = ("/com/blinddealercasino/blackjack/application/img/bet3d" + Integer.toString(betImageValue) + "zl.png");
				imvBetPlayer4.setImage(new Image(betImageName));
				flagPlayer4bet = true;								
				updateSaldo(chipValue.getValue() + differenceOverMaximum);
			
			}else{
				Alert noMoney = new Alert(AlertType.NONE, "You don't have enough money!", ButtonType.OK);
				noMoney.setTitle("Error");
				noMoney.showAndWait();
			}
		}
		if(button.equals(btnBetPlayer5)){
			
			haveMoney = checkSaldo(chipValue.getValue());
		
			if(haveMoney == true){
	
				int differenceOverMaximum = 0;
				int betImageValue = 0;
			
				betPlayer5.setOneChipValue(chipValue.getValue());
				int betValue = betPlayer5.getTotalBet();
			
				if(betValue == 10){
					betImageValue = 10;
				}
				if(betValue > 10 && betValue <50){
					betImageValue = 20;
				}
				if(betValue >= 50 && betValue < 100){
					betImageValue = 50;
				}
				if(betValue >= 100 && betValue <500){
					betImageValue = 100;
				}
				if(betValue == 500){
					betImageValue = 500;
				}
				if(betValue > 500){
				
					betImageValue = 500;
					differenceOverMaximum = overMaximum(betPlayer5);
				
					
				}
				
				String betImageName = ("/com/blinddealercasino/blackjack/application/img/bet3d" + Integer.toString(betImageValue) + "zl.png");
				imvBetPlayer5.setImage(new Image(betImageName));
				flagPlayer5bet = true;								
				updateSaldo(chipValue.getValue() + differenceOverMaximum);
			
			}else{
				Alert noMoney = new Alert(AlertType.NONE, "You don't have enough money!", ButtonType.OK);
				noMoney.setTitle("Error");
				noMoney.showAndWait();
			}
		}
	}
	private int overMaximum(Bet betPlayerX) {
		int oldBet = betPlayerX.getPreviousBet();
		betPlayerX.setTotalBet(500);
		int difference = 500 - oldBet;		
		Alert overMaximum = new Alert(AlertType.NONE, "Your bet is too high! Maximum 500 zl.", ButtonType.OK);
		overMaximum.setTitle("Error");
		overMaximum.showAndWait();

		return difference;
		
	}

	public boolean checkSaldo(int bet) throws IOException{
		int saldoValue = saldo.getSaldoProperty().get();
		if(saldoValue < bet)
			return false;
		return true;
	}

	public void updateSaldo(int bet){
		int saldoValue = saldo.getSaldoProperty().get();
		saldo.getSaldoProperty().set(saldoValue - bet);
		lblSaldo.setText(Integer.toString(saldoValue-bet) + "zl");
	}
	
	public void btnDealClicked(ActionEvent event){
		
		if(flagPlayer1bet || flagPlayer2bet || flagPlayer3bet || flagPlayer4bet || flagPlayer5bet){
			btnDeal.setOpacity(0.00);
			btnBetPlayer1.setDisable(true);
			btnBetPlayer2.setDisable(true);
			btnBetPlayer3.setDisable(true);
			btnBetPlayer4.setDisable(true);
			btnBetPlayer5.setDisable(true);
			doFirstPhase();
			doFirstPlayerDecisions();
		}else{
			Alert noBet = new Alert(AlertType.NONE, "You have to do some bets first!", ButtonType.OK);
			noBet.show();
		}
	}

	private void doDealerCards() {
		
		if(flagPlayer1bet || flagPlayer2bet || flagPlayer3bet  || flagPlayer4bet  || flagPlayer5bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			dealerTotalCount = dealerTotalCount + cardValue;	
			lblDealerTotal.setText(Integer.toString(dealerTotalCount));
			dealerCard2.setImage(cardImage);
			dealerCardCount++;
			if(cardValue == 11){
				dealerAces++;
			}
			for(int i = 0; i < 2; i++){
				if(dealerTotalCount >21 && dealerAces !=0){
					dealerTotalCount = dealerTotalCount - 10;
					dealerAces--;
					lblDealerTotal.setText(Integer.toString(dealerTotalCount));
				}
			}
			if(dealerTotalCount < 17){
				Card card2 = shuffledDecks.get(shuffledDecks.size()-1);
				shuffledDecks.remove(shuffledDecks.size()-1);
				Image card2Image = card2.getCardImage();
				int card2Value = card2.getCardValue();
				dealerTotalCount = dealerTotalCount + card2Value;	
				lblDealerTotal.setText(Integer.toString(dealerTotalCount));
				dealerCard3.setImage(card2Image);
				dealerCardCount++;
				if(card2Value == 11){
					dealerAces++;
				}
				if(dealerTotalCount >21 && dealerAces !=0){
					dealerTotalCount = dealerTotalCount - 10;
					dealerAces--;
					lblDealerTotal.setText(Integer.toString(dealerTotalCount));
				}
				if(dealerTotalCount < 17){
					Card card3 = shuffledDecks.get(shuffledDecks.size()-1);
					shuffledDecks.remove(shuffledDecks.size()-1);
					Image card3Image = card3.getCardImage();
					int card3Value = card3.getCardValue();
					dealerTotalCount = dealerTotalCount + card3Value;	
					lblDealerTotal.setText(Integer.toString(dealerTotalCount));
					dealerCard4.setImage(card3Image);
					dealerCardCount++;
					if(card3Value == 11){
						dealerAces++;
					}
					
					if(dealerTotalCount < 17){
						Card card4 = shuffledDecks.get(shuffledDecks.size()-1);
						shuffledDecks.remove(shuffledDecks.size()-1);
						Image card4Image = card4.getCardImage();
						int card4Value = card4.getCardValue();
						dealerTotalCount = dealerTotalCount + card4Value;	
						lblDealerTotal.setText(Integer.toString(dealerTotalCount));
						dealerCard5.setImage(card4Image);
						dealerCardCount++;
						if(card4Value == 11){
							dealerAces++;
						}
						if(dealerTotalCount >21 && dealerAces !=0){
							dealerTotalCount = dealerTotalCount - 10;
							dealerAces--;
							lblDealerTotal.setText(Integer.toString(dealerTotalCount));
						}
						if(dealerTotalCount < 17){
							Card card5 = shuffledDecks.get(shuffledDecks.size()-1);
							shuffledDecks.remove(shuffledDecks.size()-1);
							Image card5Image = card5.getCardImage();
							int card5Value = card5.getCardValue();
							dealerTotalCount = dealerTotalCount + card5Value;	
							lblDealerTotal.setText(Integer.toString(dealerTotalCount));
							dealerCard6.setImage(card5Image);
							dealerCardCount++;
							if(card5Value == 11){
								dealerAces++;
							}
							if(dealerTotalCount >21 && dealerAces !=0){
								dealerTotalCount = dealerTotalCount - 10;
								dealerAces--;
								lblDealerTotal.setText(Integer.toString(dealerTotalCount));
							}
							if(dealerTotalCount < 17){
								Card card6 = shuffledDecks.get(shuffledDecks.size()-1);
								shuffledDecks.remove(shuffledDecks.size()-1);
								Image card6Image = card6.getCardImage();
								int card6Value = card6.getCardValue();
								dealerTotalCount = dealerTotalCount + card6Value;	
								lblDealerTotal.setText(Integer.toString(dealerTotalCount));
								dealerCard7.setImage(card6Image);
								dealerCardCount++;
								if(card6Value == 11){
									dealerAces++;
								}
								if(dealerTotalCount >21 && dealerAces !=0){
									dealerTotalCount = dealerTotalCount - 10;
									dealerAces--;
									lblDealerTotal.setText(Integer.toString(dealerTotalCount));
								}
								if(dealerTotalCount < 17){
									Card card7 = shuffledDecks.get(shuffledDecks.size()-1);
									shuffledDecks.remove(shuffledDecks.size()-1);
									Image card7Image = card7.getCardImage();
									int card7Value = card7.getCardValue();
									dealerTotalCount = dealerTotalCount + card7Value;	
									lblDealerTotal.setText(Integer.toString(dealerTotalCount));
									dealerCard8.setImage(card7Image);
									dealerCardCount++;
									if(card7Value == 11){
										dealerAces++;
									}
									if(dealerTotalCount >21 && dealerAces !=0){
										dealerTotalCount = dealerTotalCount - 10;
										dealerAces--;
										lblDealerTotal.setText(Integer.toString(dealerTotalCount));
									}
									if(dealerTotalCount < 17){
									
										Alert noMoreCards = new Alert(AlertType.NONE, "Dealer can't take any more cards, although he should. Therefore he loses automatically", ButtonType.OK);
										noMoreCards.show();
								
										if(flagPlayer1bet){
											int bet = betPlayer1.getTotalBet();
											int saldoValue = saldo.getSaldo();
											if(player1TotalCount == 21 && player1CardCount == 2){
												saldoValue = (int) (saldoValue + 2.5 * bet);
												saldo.setSaldo(saldoValue);
											}else{
												saldoValue = saldoValue + 2 * bet;
												saldo.setSaldo(saldoValue);
											}	
										}
										if(flagPlayer2bet){
											int bet = betPlayer2.getTotalBet();
											int saldoValue = saldo.getSaldo();
											if(player2TotalCount == 21 && player2CardCount == 2){
												saldoValue = (int) (saldoValue + 2.5 * bet);
												saldo.setSaldo(saldoValue);
											}else{
												saldoValue = saldoValue + 2 * bet;
												saldo.setSaldo(saldoValue);
											}
										
										}
										if(flagPlayer3bet){
											int bet = betPlayer3.getTotalBet();
											int saldoValue = saldo.getSaldo();
											if(player3TotalCount == 21 && player3CardCount == 2){
												saldoValue = (int) (saldoValue + 2.5 * bet);
												saldo.setSaldo(saldoValue);
											}else{
												saldoValue = saldoValue + 2 * bet;
												saldo.setSaldo(saldoValue);
											}
										
										}
										if(flagPlayer4bet){
											int bet = betPlayer4.getTotalBet();
											int saldoValue = saldo.getSaldo();
											if(player4TotalCount == 21 && player4CardCount == 2){
												saldoValue = (int) (saldoValue + 2.5 * bet);
												saldo.setSaldo(saldoValue);
											}else{
												saldoValue = saldoValue + 2 * bet;
												saldo.setSaldo(saldoValue);
											}
										
										}
										if(flagPlayer5bet){
											int bet = betPlayer5.getTotalBet();
											int saldoValue = saldo.getSaldo();
											if(player5TotalCount == 21 && player5CardCount == 2){
												saldoValue = (int) (saldoValue + 2.5 * bet);
												saldo.setSaldo(saldoValue);
											}else{
												saldoValue = saldoValue + 2 * bet;
												saldo.setSaldo(saldoValue);
											}
										
										}
								
									}
								}
							}
						}	
					}	
				}	
			}
			if((dealerTotalCount >= 17) && dealerTotalCount <= 21){
				if(dealerTotalCount == 21 && dealerCardCount == 2){
					if(flagPlayer1bet){
						if(dealerTotalCount == player1TotalCount && player1CardCount == 2){
							int bet = betPlayer1.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("Draw!");
						}else{
							imvBetPlayer1.setImage(imgBet);
							lblPlayer1Total.setText("Lost!");
							flagPlayer1bet = false;
						}
					}
					if(flagPlayer2bet){
						if(dealerTotalCount == player2TotalCount && player2CardCount == 2){
							int bet = betPlayer2.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("Draw!");
						}else{
							imvBetPlayer2.setImage(imgBet);
							lblPlayer2Total.setText("Lost!");
							flagPlayer2bet = false;
						}
					}
					if(flagPlayer3bet){
						if(dealerTotalCount == player3TotalCount && player3CardCount == 2){
							int bet = betPlayer3.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("Draw!");
						}else{
							imvBetPlayer3.setImage(imgBet);
							lblPlayer3Total.setText("Lost!");
							flagPlayer3bet = false;
						}
					}
					if(flagPlayer4bet){
						if(dealerTotalCount == player4TotalCount && player4CardCount == 2){
							int bet = betPlayer4.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Draw!");
						}else{
							imvBetPlayer4.setImage(imgBet);
							lblPlayer4Total.setText("Lost!");
							flagPlayer4bet = false;
						}
					}
					if(flagPlayer5bet){
						if(dealerTotalCount == player5TotalCount && player5CardCount == 2){
							int bet = betPlayer5.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("Draw!");
						}else{
							imvBetPlayer5.setImage(imgBet);
							lblPlayer5Total.setText("Lost!");
							flagPlayer5bet = false;
						}
					}
				}if(dealerTotalCount ==21 && dealerCardCount !=2){
					if(flagPlayer1bet){
						if(player1CardCount == 2 && player1TotalCount == 21){
							int bet = betPlayer1.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = (int) (saldoValue + 2.5 * bet);
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("Blackjack!!");
						}
						if(player1CardCount !=2 && player1TotalCount == 21){
							int bet = betPlayer1.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue + bet;
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("Draw!");
						}
						if(player1TotalCount != 21){
							imvBetPlayer1.setImage(imgBet);					
							flagPlayer1bet = false;
							lblPlayer1Total.setText("Lost!");
						}
					}
					if(flagPlayer2bet){
						if(player2CardCount == 2 && player2TotalCount == 21){
							int bet = betPlayer2.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = (int) (saldoValue + 2.5 * bet);
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("Blackjack!!");
						}
						if(player2CardCount !=2 && player2TotalCount == 21){
							int bet = betPlayer2.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue + bet;
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("Draw!");
						}
						if(player2TotalCount != 21){
							imvBetPlayer2.setImage(imgBet);					
							flagPlayer2bet = false;
							lblPlayer2Total.setText("Lost!");
						}
					}
					if(flagPlayer3bet){
						if(player3CardCount == 2 && player3TotalCount == 21){
							int bet = betPlayer3.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = (int) (saldoValue + 2.5 * bet);
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("Blackjack!!");
						}
						if(player3CardCount !=2 && player3TotalCount == 21){
							int bet = betPlayer3.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue + bet;
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("Draw!");
						}
						if(player3TotalCount != 21){
							imvBetPlayer3.setImage(imgBet);					
							flagPlayer3bet = false;
							lblPlayer3Total.setText("Lost!");
						}
					}
					if(flagPlayer4bet){
						if(player4CardCount == 2 && player4TotalCount == 21){
							int bet = betPlayer4.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = (int) (saldoValue + 2.5 * bet);
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Blackjack!!");
						}
						if(player4CardCount !=2 && player4TotalCount == 21){
							int bet = betPlayer4.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue + bet;
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Draw!");
						}
						if(player4TotalCount != 21){
							imvBetPlayer4.setImage(imgBet);					
							flagPlayer4bet = false;
							lblPlayer4Total.setText("Lost!");
						}
					}
					if(flagPlayer5bet){
						if(player5CardCount == 2 && player5TotalCount == 21){
							int bet = betPlayer5.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = (int) (saldoValue + 2.5 * bet);
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("Blackjack!!");
						}
						if(player5CardCount !=2 && player5TotalCount == 21){
							int bet = betPlayer5.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue + bet;
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("Draw!");
						}
						if(player5TotalCount != 21){
							imvBetPlayer5.setImage(imgBet);					
							flagPlayer5bet = false;
							lblPlayer5Total.setText("Lost!");
						}
					}
				
				}else{
					if(flagPlayer1bet){
						if(dealerTotalCount > player1TotalCount){
							imvBetPlayer1.setImage(imgBet);			
							flagPlayer1bet = false;
							lblPlayer1Total.setText("Lost!");
						}
						if(dealerTotalCount == player1TotalCount){
							int bet = betPlayer1.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("Draw!");
						}
						if(dealerTotalCount < player1TotalCount){
							
							int saldoValue = saldo.getSaldo();
							int bet = betPlayer1.getTotalBet();
							if(player1TotalCount == 21 && player1CardCount ==2){
								saldoValue = (int) (saldoValue + bet * 1.5);
								saldo.setSaldo(saldoValue);;
								lblPlayer1Total.setText("BlackJack!!");
							}else{
								saldoValue = saldoValue + bet * 2;
								saldo.setSaldo(saldoValue);
								lblPlayer1Total.setText("Win!");
							}
						
						}
					}
					if(flagPlayer2bet){
						if(dealerTotalCount > player2TotalCount){
							imvBetPlayer2.setImage(imgBet);				
							flagPlayer2bet = false;
							lblPlayer2Total.setText("Lost!");
						}
						if(dealerTotalCount == player2TotalCount){
							int bet = betPlayer2.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("Draw!");
						}
						if(dealerTotalCount < player2TotalCount){
				
							int saldoValue = saldo.getSaldo();
							int bet = betPlayer2.getTotalBet();
							if(player2TotalCount == 21 && player2CardCount ==2){
								saldoValue = (int) (saldoValue + bet + bet * 1.5);
								saldo.setSaldo(saldoValue);
								lblPlayer2Total.setText("BlackJack!!");
							}else{
								saldoValue = saldoValue + bet * 2;
								saldo.setSaldo(saldoValue);
								lblPlayer2Total.setText("Win!");
							}
						
						}
					}
					if(flagPlayer3bet){
						if(dealerTotalCount > player3TotalCount){
							imvBetPlayer3.setImage(imgBet);					
							flagPlayer3bet = false;
							lblPlayer3Total.setText("Lost!");
						}
						if(dealerTotalCount == player3TotalCount){
							int bet = betPlayer3.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("Draw!");
						}
						if(dealerTotalCount < player3TotalCount){
				
							int saldoValue = saldo.getSaldo();
							int bet = betPlayer3.getTotalBet();
							if(player3TotalCount == 21 && player3CardCount ==2){
								saldoValue = (int) (saldoValue + bet + bet * 1.5);
								saldo.setSaldo(saldoValue);
								lblPlayer3Total.setText("BlackJack!!");
							}else{
								saldoValue = saldoValue + bet * 2;
								saldo.setSaldo(saldoValue);
								lblPlayer3Total.setText("Win!");
							}
						
						}
					}
					if(flagPlayer4bet){
						if(dealerTotalCount > player4TotalCount){
							imvBetPlayer4.setImage(imgBet);			
							flagPlayer4bet = false;
							lblPlayer4Total.setText("Lost!");
						}
						if(dealerTotalCount == player4TotalCount){
							int bet = betPlayer4.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Draw!");
						}
						if(dealerTotalCount < player4TotalCount){
				
							int saldoValue = saldo.getSaldo();
							int bet = betPlayer4.getTotalBet();
							if(player2TotalCount == 21 && player4CardCount ==2){
								saldoValue = (int) (saldoValue + bet + bet * 1.5);
								saldo.setSaldo(saldoValue);
								lblPlayer4Total.setText("Blackjack!!");
							}else{
								saldoValue = saldoValue + bet * 2;
								saldo.setSaldo(saldoValue);
								lblPlayer4Total.setText("Win!");
							}
						
						}
					}
					if(flagPlayer5bet){
						if(dealerTotalCount > player5TotalCount){
							imvBetPlayer5.setImage(imgBet);					
							flagPlayer5bet = false;
							lblPlayer5Total.setText("Lost!");
						}
						if(dealerTotalCount == player5TotalCount){
							int bet = betPlayer5.getTotalBet();
							int saldoValue = saldo.getSaldo();
							saldoValue = saldoValue+bet;
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("Draw!");
						}
						if(dealerTotalCount < player5TotalCount){
							
							int saldoValue = saldo.getSaldo();
							int bet = betPlayer5.getTotalBet();
							if(player2TotalCount == 21 && player5CardCount ==2){
								saldoValue = (int) (saldoValue + bet + bet * 1.5);
								saldo.setSaldo(saldoValue);
								lblPlayer5Total.setText("BlackJack!!");
							}else{
								saldoValue = saldoValue + bet * 2;
								saldo.setSaldo(saldoValue);
								lblPlayer5Total.setText("Win!");
							}
						
						}
					}
				}
				newGame();
			}
			if(dealerTotalCount > 21){
				
					if(flagPlayer1bet){
						
						int bet = betPlayer1.getTotalBet();
						int saldoValue = saldo.getSaldo();
						if(player1TotalCount == 21 && player1CardCount == 2){
							saldoValue = (int) (saldoValue + bet *2.5);
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("BlackJack!!");
						}else{
							saldoValue = saldoValue + 2 * bet;
							saldo.setSaldo(saldoValue);
							lblPlayer1Total.setText("Win!");
						}
					
					}
					if(flagPlayer2bet){
						
						int bet = betPlayer2.getTotalBet();
						int saldoValue = saldo.getSaldo();
						if(player2TotalCount == 21 && player2CardCount == 2){
							saldoValue = (int) (saldoValue + bet *2.5);
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("BlackJack!!");
						}else{
							saldoValue = saldoValue + 2 * bet;
							saldo.setSaldo(saldoValue);
							lblPlayer2Total.setText("Win!");
						}
					}
					if(flagPlayer3bet){
						
						int bet = betPlayer3.getTotalBet();
						int saldoValue = saldo.getSaldo();
						if(player3TotalCount == 21 && player3CardCount == 2){
							saldoValue = (int) (saldoValue + bet *2.5);
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("BlackJack!!");
						}else{
							saldoValue = saldoValue + 2 * bet;
							saldo.setSaldo(saldoValue);
							lblPlayer3Total.setText("Win!");
						}
					}
					if(flagPlayer4bet){
						int bet = betPlayer4.getTotalBet();
						int saldoValue = saldo.getSaldo();
						if(player4TotalCount == 21 && player4CardCount == 2){
							saldoValue = (int) (saldoValue + bet *2.5);
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Blackjack!!");
						}else{
							saldoValue = saldoValue + 2 * bet;
							saldo.setSaldo(saldoValue);
							lblPlayer4Total.setText("Win!");
						}
					}
					if(flagPlayer5bet){
						int bet = betPlayer5.getTotalBet();
						int saldoValue = saldo.getSaldo();
						if(player5TotalCount == 21 && player5CardCount == 2){
							saldoValue = (int) (saldoValue + bet *2.5);
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("BlackJack!!");
						}else{
							saldoValue = saldoValue + 2 * bet;
							saldo.setSaldo(saldoValue);
							lblPlayer5Total.setText("Win!");
						}
					}
				
			
			newGame();
			}
						
		}else{
			newGame();
		}
								
	}

	private void newGame() {
		btnNewGame.setDisable(false);
		btnNewGame.setOpacity(1);
		
	}
	
	public void btnNewGameClicked(ActionEvent event){
		//btn newGame disappearing
		btnNewGame.setDisable(true);
		btnNewGame.setOpacity(0);
		
		//checking if new shuffling is needed
		int remainingCards = shuffledDecks.size();
		if(remainingCards < 110){
			shuffleDecks();
		}
		
		//imv with cards set to null
		dealerCard1.setImage(null);
		dealerCard2.setImage(null);
		dealerCard3.setImage(null);
		dealerCard4.setImage(null);
		dealerCard5.setImage(null);
		dealerCard6.setImage(null);
		dealerCard7.setImage(null);
		dealerCard8.setImage(null);
		player1Card1.setImage(null);
		player1Card2.setImage(null);
		player1Card3.setImage(null);
		player1Card4.setImage(null);
		player1Card5.setImage(null);
		player1Card6.setImage(null);
		player1Card7.setImage(null);
		player1Card8.setImage(null);
		player1Card9.setImage(null);
		player2Card1.setImage(null);
		player2Card2.setImage(null);
		player2Card3.setImage(null);
		player2Card4.setImage(null);
		player2Card5.setImage(null);
		player2Card6.setImage(null);
		player2Card7.setImage(null);
		player2Card8.setImage(null);
		player2Card9.setImage(null);
		player3Card1.setImage(null);
		player3Card2.setImage(null);
		player3Card3.setImage(null);
		player3Card4.setImage(null);
		player3Card5.setImage(null);
		player3Card6.setImage(null);
		player3Card7.setImage(null);
		player3Card8.setImage(null);
		player3Card9.setImage(null);
		player4Card1.setImage(null);
		player4Card2.setImage(null);
		player4Card3.setImage(null);
		player4Card4.setImage(null);
		player4Card5.setImage(null);
		player4Card6.setImage(null);
		player4Card7.setImage(null);
		player4Card8.setImage(null);
		player4Card9.setImage(null);
		player5Card1.setImage(null);
		player5Card2.setImage(null);
		player5Card3.setImage(null);
		player5Card4.setImage(null);
		player5Card5.setImage(null);
		player5Card6.setImage(null);
		player5Card7.setImage(null);
		player5Card8.setImage(null);
		player5Card9.setImage(null);
		
		//all bets set to 0
		betPlayer1.setTotalBet(0);
		betPlayer2.setTotalBet(0);
		betPlayer3.setTotalBet(0);
		betPlayer4.setTotalBet(0);
		betPlayer5.setTotalBet(0);
		
		//all imvBet set to null
		
		imvBetPlayer1.setImage(imgBet);
		imvBetPlayer2.setImage(imgBet);
		imvBetPlayer3.setImage(imgBet);
		imvBetPlayer4.setImage(imgBet);
		imvBetPlayer5.setImage(imgBet);
		
		//all labels set to null
		
		lblDealerTotal.setText("");
		lblPlayer1Total.setText("");
		lblPlayer2Total.setText("");
		lblPlayer3Total.setText("");
		lblPlayer4Total.setText("");
		lblPlayer5Total.setText("");
		
		//all counters set to 0
		
		player1TotalCount = 0;
		player2TotalCount = 0;
		player3TotalCount = 0;
		player4TotalCount = 0;
		player5TotalCount = 0;
		dealerTotalCount = 0;
		
		player1Aces = 0;
		player2Aces = 0;
		player3Aces = 0;
		player4Aces = 0;
		player5Aces = 0;
		dealerAces = 0;
		
		player1CardCount = 2;
		player2CardCount = 2;
		player3CardCount = 2;
		player4CardCount = 2;
		player5CardCount = 2;
		dealerCardCount = 1;
		
		
		//all bets enabled
		
		btnBetPlayer1.setDisable(false);
		btnBetPlayer2.setDisable(false);
		btnBetPlayer3.setDisable(false);
		btnBetPlayer4.setDisable(false);
		btnBetPlayer5.setDisable(false);
		
		//btn Deal
		btnDeal.setDisable(false);
		btnDeal.setOpacity(1);
		
		//all flags to false
		
		flagPlayer1bet = false;
		flagPlayer2bet = false;
		flagPlayer3bet = false;
		flagPlayer4bet = false;
		flagPlayer5bet = false;
		
		
		
	}

	private void doFifthPlayerDecisions() {
		if(flagPlayer5bet){
			if(player5TotalCount != 21){
				btnHitPlayer5.setDisable(false);
				btnStayPlayer5.setDisable(false);
			}else{
				doDealerCards();
			}
		}else{
			doDealerCards();
		}
		
	}

	private void doFourthPlayerDecisions() {
		if(flagPlayer4bet){
			if(player4TotalCount != 21){
				btnHitPlayer4.setDisable(false);
				btnStayPlayer4.setDisable(false);
			}else{
				doFifthPlayerDecisions();
			}
		}else{
			doFifthPlayerDecisions();
		}
		
	}

	private void doThirdPlayerDecisions() {
		if(flagPlayer3bet){
			if(player3TotalCount != 21){
				btnHitPlayer3.setDisable(false);
				btnStayPlayer3.setDisable(false);
			}else{
				doFourthPlayerDecisions();
			}
		}else{
			doFourthPlayerDecisions();
		}
	}

	private void doSecondPlayerDecisions() {
		if(flagPlayer2bet){
			if(player2TotalCount != 21){
				btnHitPlayer2.setDisable(false);
				btnStayPlayer2.setDisable(false);
			}else{
				doThirdPlayerDecisions();
			}
		}else{
			doThirdPlayerDecisions();
		}
		
	}

	private void doFirstPlayerDecisions() {
		if(flagPlayer1bet){

			if(player1TotalCount != 21){
				btnHitPlayer1.setDisable(false);
				btnStayPlayer1.setDisable(false);
			}else{
				doSecondPlayerDecisions();
			}
		}else{
			doSecondPlayerDecisions();
		}
		
		
	}
	
	public void btnHitClicked(ActionEvent event){
		
		Button button = (Button) event.getSource();
		if(button.equals(btnHitPlayer1)){
		
		
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			player1TotalCount = player1TotalCount + cardValue;	
			lblPlayer1Total.setText(Integer.toString(player1TotalCount));
			if(cardValue == 11){
				player1Aces++;
			}
				if(player1CardCount == 2){
					player1Card3.setImage(cardImage);
					
				}
				if(player1CardCount == 3){
					player1Card4.setImage(cardImage);
					
				}
				if(player1CardCount == 4){
					player1Card5.setImage(cardImage);
					
				}
				if(player1CardCount == 5){
					player1Card6.setImage(cardImage);
					
				}
				if(player1CardCount == 6){
					player1Card7.setImage(cardImage);
					
				}
				if(player1CardCount == 7){
					player1Card8.setImage(cardImage);
					
				}
				if(player1CardCount == 8){
					player1Card9.setImage(cardImage);
					btnHitPlayer1.setDisable(true);
					btnStayPlayer2.setDisable(true);
					Alert noMoreCards = new Alert(AlertType.INFORMATION, "You've taken all cards! No more place for another card. That's really strange, one chance for a million times!", ButtonType.OK);
					noMoreCards.show();
					doNextPlayerDecisions(button);
					
				}
				player1CardCount++;
			
				if(player1TotalCount == 21){
					btnHitPlayer1.setDisable(true);
					btnStayPlayer1.setDisable(true);									
					doNextPlayerDecisions(button);
				}
				
				if(player1TotalCount >21){
					if(player1Aces > 0){
						player1TotalCount = player1TotalCount - 10;
						lblPlayer1Total.setText(Integer.toString(player1TotalCount));
						player1Aces--;
					}else{
						imvBetPlayer1.setImage(new Image("/application/img/bet.png"));
						btnHitPlayer1.setDisable(true);
						btnStayPlayer1.setDisable(true);	
						flagPlayer1bet = false;
						lblPlayer1Total.setText("Lost!");
						doNextPlayerDecisions(button);
						
						
					}	
				}
				
				
		}
		
		if(button.equals(btnHitPlayer2)){
			
			
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			player2TotalCount = player2TotalCount + cardValue;	
			lblPlayer2Total.setText(Integer.toString(player2TotalCount));
			if(cardValue == 11){
				player2Aces++;
			}
				if(player2CardCount == 2){
					player2Card3.setImage(cardImage);
					
				}
				if(player2CardCount == 3){
					player2Card4.setImage(cardImage);
					
				}
				if(player2CardCount == 4){
					player2Card5.setImage(cardImage);
					
				}
				if(player2CardCount == 5){
					player2Card6.setImage(cardImage);
					
				}
				if(player2CardCount == 6){
					player2Card7.setImage(cardImage);
					
				}
				if(player2CardCount == 7){
					player2Card8.setImage(cardImage);
					
				}
				if(player2CardCount == 8){
					player2Card9.setImage(cardImage);
					btnHitPlayer2.setDisable(true);
					btnStayPlayer2.setDisable(true);
					Alert noMoreCards = new Alert(AlertType.INFORMATION, "You've taken all cards! No more place for another card. That's really strange, one chance for a million times!", ButtonType.OK);
					noMoreCards.show();
					doNextPlayerDecisions(button);
					
				}
				player2CardCount++;
			
				if(player2TotalCount == 21){
					btnHitPlayer2.setDisable(true);
					btnStayPlayer2.setDisable(true);									
					doNextPlayerDecisions(button);
				}
				
				if(player2TotalCount >21){
					if(player2Aces > 0){
						player2TotalCount = player2TotalCount - 10;
						lblPlayer2Total.setText(Integer.toString(player2TotalCount));
						player2Aces--;
					}else{
						
						imvBetPlayer2.setImage(new Image("/application/img/bet.png"));		
						btnHitPlayer2.setDisable(true);
						btnStayPlayer2.setDisable(true);	
						flagPlayer2bet = false;
						lblPlayer2Total.setText("Lost!");
						doNextPlayerDecisions(button);
					
					}	
				}
				
				
		}
		
		if(button.equals(btnHitPlayer3)){
			
			
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			player3TotalCount = player3TotalCount + cardValue;	
			lblPlayer3Total.setText(Integer.toString(player3TotalCount));
			if(cardValue == 11){
				player3Aces++;
			}
				if(player3CardCount == 2){
					player3Card3.setImage(cardImage);
					
				}
				if(player3CardCount == 3){
					player3Card4.setImage(cardImage);
					
				}
				if(player3CardCount == 4){
					player3Card5.setImage(cardImage);
					
				}
				if(player3CardCount == 5){
					player3Card6.setImage(cardImage);
					
				}
				if(player3CardCount == 6){
					player3Card7.setImage(cardImage);
					
				}
				if(player3CardCount == 7){
					player3Card8.setImage(cardImage);
					
				}
				if(player3CardCount == 8){
					player3Card9.setImage(cardImage);
					btnHitPlayer3.setDisable(true);
					btnStayPlayer3.setDisable(true);
					Alert noMoreCards = new Alert(AlertType.INFORMATION, "You've taken all cards! No more place for another card. That's really strange, one chance for a million times!", ButtonType.OK);
					noMoreCards.show();
					doNextPlayerDecisions(button);
					
				}
				player3CardCount++;
			
				if(player3TotalCount == 21){
					btnHitPlayer3.setDisable(true);
					btnStayPlayer3.setDisable(true);									
					doNextPlayerDecisions(button);
				}
				
				if(player3TotalCount >21){
					if(player3Aces > 0){
						player3TotalCount = player3TotalCount - 10;
						lblPlayer3Total.setText(Integer.toString(player3TotalCount));
						player3Aces--;
					}else{
						
						imvBetPlayer3.setImage(new Image("/application/img/bet.png"));		
						btnHitPlayer3.setDisable(true);
						btnStayPlayer3.setDisable(true);
						flagPlayer3bet = false;
						lblPlayer3Total.setText("Lost!");
						doNextPlayerDecisions(button);
						
					}	
				}
				
				
		}
		
		if(button.equals(btnHitPlayer4)){
			
			
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			player4TotalCount = player4TotalCount + cardValue;	
			lblPlayer4Total.setText(Integer.toString(player4TotalCount));
			if(cardValue == 11){
				player4Aces++;
			}
				if(player4CardCount == 2){
					player4Card3.setImage(cardImage);
					
				}
				if(player4CardCount == 3){
					player4Card4.setImage(cardImage);
					
				}
				if(player4CardCount == 4){
					player4Card5.setImage(cardImage);
					
				}
				if(player4CardCount == 5){
					player4Card6.setImage(cardImage);
					
				}
				if(player4CardCount == 6){
					player4Card7.setImage(cardImage);
					
				}
				if(player4CardCount == 7){
					player4Card8.setImage(cardImage);
					
				}
				if(player4CardCount == 8){
					player4Card9.setImage(cardImage);
					btnHitPlayer4.setDisable(true);
					btnStayPlayer4.setDisable(true);
					Alert noMoreCards = new Alert(AlertType.INFORMATION, "You've taken all cards! No more place for another card. That's really strange, one chance for a million times!", ButtonType.OK);
					noMoreCards.show();
					doNextPlayerDecisions(button);
					
				}
				player4CardCount++;
			
				if(player4TotalCount == 21){
					btnHitPlayer4.setDisable(true);
					btnStayPlayer4.setDisable(true);									
					doNextPlayerDecisions(button);
				}
				
				if(player4TotalCount > 21){
					if(player4Aces > 0){
						player4TotalCount = player4TotalCount - 10;
						lblPlayer4Total.setText(Integer.toString(player4TotalCount));
						player4Aces--;
					}else{
						
						imvBetPlayer4.setImage(new Image("/application/img/bet.png"));		
						btnHitPlayer4.setDisable(true);
						btnStayPlayer4.setDisable(true);	
						flagPlayer4bet = false;
						lblPlayer4Total.setText("Lost!");
						doNextPlayerDecisions(button);
						
					}	
				}
				
				
		}
		
		if(button.equals(btnHitPlayer5)){
			
			
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			int cardValue = card.getCardValue();
			player5TotalCount = player5TotalCount + cardValue;	
			lblPlayer5Total.setText(Integer.toString(player5TotalCount));
			if(cardValue == 11){
				player5Aces++;
			}
				if(player5CardCount == 2){
					player5Card3.setImage(cardImage);
					
				}
				if(player5CardCount == 3){
					player5Card4.setImage(cardImage);
					
				}
				if(player5CardCount == 4){
					player5Card5.setImage(cardImage);
					
				}
				if(player5CardCount == 5){
					player5Card6.setImage(cardImage);
					
				}
				if(player5CardCount == 6){
					player5Card7.setImage(cardImage);
					
				}
				if(player5CardCount == 7){
					player5Card8.setImage(cardImage);
					
				}
				if(player5CardCount == 8){
					player5Card9.setImage(cardImage);
					btnHitPlayer5.setDisable(true);
					btnStayPlayer5.setDisable(true);
					Alert noMoreCards = new Alert(AlertType.INFORMATION, "You've taken all cards! No more place for another card. That's really strange, one chance for a million times!", ButtonType.OK);
					noMoreCards.show();
					doNextPlayerDecisions(button);
					
				}
				player5CardCount++;
			
				if(player5TotalCount == 21){
					btnHitPlayer5.setDisable(true);
					btnStayPlayer5.setDisable(true);
				
					doNextPlayerDecisions(button);
					
				}
				
				if(player5TotalCount >21){
					if(player5Aces > 0){
						player5TotalCount = player5TotalCount - 10;
						lblPlayer5Total.setText(Integer.toString(player5TotalCount));
						player5Aces--;
					}else{
						
						imvBetPlayer5.setImage(new Image("/application/img/bet.png"));		
						btnHitPlayer5.setDisable(true);
						btnStayPlayer5.setDisable(true);
						flagPlayer5bet = false;
						lblPlayer5Total.setText("Lost!");
						doNextPlayerDecisions(button);
						
					}	
				}
				
				
		}
		
			
		
	}

	public void doNextPlayerDecisions(Button button){
		if(button.equals(btnHitPlayer1)){
			;
			doSecondPlayerDecisions();
			
		}
		if(button.equals(btnHitPlayer2)){
			doThirdPlayerDecisions();
		}
		if(button.equals(btnHitPlayer3)){
			doFourthPlayerDecisions();
		}
		if(button.equals(btnHitPlayer4)){
			doFifthPlayerDecisions();
		}
		if(button.equals(btnHitPlayer5)){
			
			doDealerCards();
		
		}
	}
	public void btnStayClicked(ActionEvent event){
			Button button = (Button) event.getSource();
			if(button.equals(btnStayPlayer1)){
				btnHitPlayer1.setDisable(true);
				btnStayPlayer1.setDisable(true);
				doSecondPlayerDecisions();
			}
			if(button.equals(btnStayPlayer2)){
				btnHitPlayer2.setDisable(true);
				btnStayPlayer2.setDisable(true);
				doThirdPlayerDecisions();
			}
			if(button.equals(btnStayPlayer3)){
				btnHitPlayer3.setDisable(true);
				btnStayPlayer3.setDisable(true);
				doFourthPlayerDecisions();
			}
			if(button.equals(btnStayPlayer4)){
				btnHitPlayer4.setDisable(true);
				btnStayPlayer4.setDisable(true);
				doFifthPlayerDecisions();
			}
			if(button.equals(btnStayPlayer5)){
				btnHitPlayer5.setDisable(true);
				btnStayPlayer5.setDisable(true);
				
				doDealerCards();
			}
			
			
	}

	public void shuffleDecks(){

		shuffledDecks = new ArrayList<Card>(312);
		
		for(int i = 0; i < 6; i++){
			for(int e = 0; e < 52; e++){
				Card next = deck1.getCards().get(e);
				allCards.add(next);
			}
		}
		int amountOfCardsLeft = 312;
		
		for(int i = 0; i < 312; i++){
			Random random = new Random();
			int pickACard = random.nextInt(amountOfCardsLeft);
			amountOfCardsLeft--;
			shuffledDecks.add(allCards.get(pickACard));
			allCards.remove(pickACard);

		}
	}
	
	public void doFirstPhase(){
		if(flagPlayer1bet){

			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player1Card1.setImage(cardImage);
			int cardValue = card.getCardValue();
			player1TotalCount = player1TotalCount + cardValue;	
			if(cardValue == 11){
				player1Aces++;
			}
		}
		if(flagPlayer2bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player2Card1.setImage(cardImage);
			int cardValue = card.getCardValue();
			player2TotalCount = player2TotalCount + cardValue;	
			if(cardValue == 11){
				player2Aces++;
			}
		
		}
		if(flagPlayer3bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player3Card1.setImage(cardImage);
			int cardValue = card.getCardValue();
			player3TotalCount = player3TotalCount + cardValue;
			if(cardValue == 11){
				player3Aces++;
			}
		}
		if(flagPlayer4bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player4Card1.setImage(cardImage);
			int cardValue = card.getCardValue();
			player4TotalCount = player4TotalCount + cardValue;	
			if(cardValue == 11){
				player4Aces++;
			}
		}
		if(flagPlayer5bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player5Card1.setImage(cardImage);
			int cardValue = card.getCardValue();
			player5TotalCount = player5TotalCount + cardValue;	
			if(cardValue == 11){
				player5Aces++;
			}
		}
		if(flagPlayer1bet || flagPlayer2bet || flagPlayer3bet || flagPlayer4bet || flagPlayer5bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			dealerCard1.setImage(cardImage);
			int cardValue = card.getCardValue();
			dealerTotalCount = dealerTotalCount + cardValue;
			lblDealerTotal.setText(Integer.toString(dealerTotalCount));
			if(cardValue == 11){
				dealerAces++;
			}
		}	
		if(flagPlayer1bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player1Card2.setImage(cardImage);
			int cardValue = card.getCardValue();
			player1TotalCount = player1TotalCount + cardValue;		
			lblPlayer1Total.setText(Integer.toString(player1TotalCount));
			if(cardValue == 11){
				player1Aces++;
			}
			for(int i = 0; i < 2; i++){
				if(player1TotalCount > 21 && player1Aces != 0){
					player1TotalCount = player1TotalCount - 10;
					player1Aces--;
					lblPlayer1Total.setText(Integer.toString(player1TotalCount));
				}
			}
		}
		if(flagPlayer2bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player2Card2.setImage(cardImage);
			int cardValue = card.getCardValue();
			player2TotalCount = player2TotalCount + cardValue;	
			lblPlayer2Total.setText(Integer.toString(player2TotalCount));
			if(cardValue == 11){
				player2Aces++;
			}
			for(int i = 0; i < 2; i++){
				if(player2TotalCount > 21 && player2Aces != 0){
					player2TotalCount = player2TotalCount - 10;
					player2Aces--;
					lblPlayer2Total.setText(Integer.toString(player2TotalCount));
				}
			}
		}
		if(flagPlayer3bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player3Card2.setImage(cardImage);
			int cardValue = card.getCardValue();
			player3TotalCount = player3TotalCount + cardValue;
			lblPlayer3Total.setText(Integer.toString(player3TotalCount));
			if(cardValue == 11){
				player3Aces++;
			}
			for(int i = 0; i < 2; i++){
				if(player3TotalCount > 21 && player3Aces != 0){
					player3TotalCount = player3TotalCount - 10;
					player3Aces--;
					lblPlayer3Total.setText(Integer.toString(player3TotalCount));
				}
			}
		}
		if(flagPlayer4bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player4Card2.setImage(cardImage);
			int cardValue = card.getCardValue();
			player4TotalCount = player4TotalCount + cardValue;
			lblPlayer4Total.setText(Integer.toString(player4TotalCount));
			if(cardValue == 11){
				player4Aces++;
			}
			for(int i = 0; i < 2; i++){
				if(player4TotalCount > 21 && player4Aces != 0){
					player4TotalCount = player4TotalCount - 10;
					player4Aces--;
					lblPlayer4Total.setText(Integer.toString(player4TotalCount));
				}
			}
		}
		if(flagPlayer5bet){
			Card card = shuffledDecks.get(shuffledDecks.size()-1);
			shuffledDecks.remove(shuffledDecks.size()-1);
			Image cardImage = card.getCardImage();
			player5Card2.setImage(cardImage);
			int cardValue = card.getCardValue();
			player5TotalCount = player5TotalCount + cardValue;	
			lblPlayer5Total.setText(Integer.toString(player5TotalCount));
			if(cardValue == 11){
				player5Aces++;
			}
			for(int i = 0; i < 2; i++){
				if(player5TotalCount > 21 && player5Aces != 0){
					player5TotalCount = player5TotalCount - 10;
					player5Aces--;
					lblPlayer5Total.setText(Integer.toString(player5TotalCount));
				}
			}
		}
	}
}
