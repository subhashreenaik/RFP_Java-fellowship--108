package com.assignment;
import java.lang.Math;


public class SnakeAndLadderTwoPlayers {
	
	static int rollDice() {
		int diceValue = (int)(Math.random() *6)+1;
		return diceValue;
	}
	
	static int pickOption() {
		int options = (int)(Math.random() *3)+1;
		return options;
	}
	
	static int play(int position) {
		
		
		int diceValue=rollDice();
		int optionType= pickOption();
		if (optionType==1) {
			
		}
		else if(optionType==2) {
			position=position+diceValue;
			
			if(position >100) {
				position = position-diceValue;
			}
			
			position=play(position);
		}
		else {
			position=position-diceValue;
			
			if(position <0) {
				position=0;
			}
		}
		return position;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int position_player1=0;
		int position_player2=0;
		
		while(true) {
			
			position_player1=play(position_player1);
			System.out.println("position of player1 is"+position_player1);
			if(position_player1==100) {
				System.out.println("player1 wins");
				break;
			}
			
			position_player2=play(position_player2);
			System.out.println("position of player2 is"+ position_player2);
			if(position_player2==100) {
				System.out.println("player2 wins");
				break;
			}
			
		}
		
		

	}

}
