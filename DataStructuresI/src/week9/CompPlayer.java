package week9;

import java.util.*;

public class CompPlayer implements PlayerInterface{
	//fields
	private char symbol;
	private char humanSymbol;
	
	//constructor
	public CompPlayer(char humanSymbol){
		this.humanSymbol = humanSymbol;
	}
	
	//get comp symbol based off of what user chose, the opposite is computer
	public char getSymbol() {
		if (humanSymbol == 'x') {
			symbol = 'o';
		}
		else {
			symbol = 'x';
		}
		return symbol;
	}
	
	//go-computers turn, computer randomly chooses a spot on the board and goes there
	//input validation to confirm that spot is available
	public int[] go() {
		Random random = new Random();
		int row;
		int col;
		
		
		do {
			 row = random.nextInt(3);
			 col = random.nextInt(3);
		}
		while (Board.board[row][col] != ' ');
		
		int[] spot = {row, col};
		
		return spot;

	}



}
