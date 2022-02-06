package com.assignment;
import java.lang.Math;

public class SnakeAndLadder {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0, diceRolled=0;
		while(position<100) {
			
			int diceValue = (int)(Math.random() *6)+1;
			diceRolled++;
			
			int options = (int)(Math.random() *3)+1;
			
			//option 1 is no play
			//option 2 is ladder
			//option 3 is snake
			
			if(options==1) {
				
			}
			else if(options==2) {
				
				position=position+diceValue;
				
				if(position >100) {
					position = position-diceValue;
				}
			}
			
			else {
				position=position-diceValue;
				
				if(position <0) {
					position=0;
				}
			}
			
			System.out.println(position+ "");
			
		}
		System.out.println("Number of times the dice is rolled:"+ diceRolled);
		
	}

}
