package week9;

import java.util.*;

public class HumanPlayer implements PlayerInterface {
	//field
	private char symbol;
	
	//constructor
	public HumanPlayer(char symbol){
		this.symbol = symbol;
	}
	
	//get symbol, based off of users input
	public char getSymbol() {
		return symbol;
	}
	
	//go-humans turn, user chooses where to go on the board and it returns their chosen spot
	public int[] go() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Select a row: ");
	    int row = scanner.nextInt();
	    
	    while (row < 0 || row > 3) {
	        System.out.println("Invalid Entry.");
	        System.out.println("Select a row: ");
	        row = scanner.nextInt();
	    }
	    
	    System.out.println("Select a column: ");
	    int col = scanner.nextInt();
	    
	    while (col < 0 || col > 3) {
	        System.out.println("Invalid Entry.");
	        System.out.println("Select a col: ");
	        col = scanner.nextInt();
	    }
	    
	    int[] result = {row,col};
	    
	    scanner.close();
	    return result;
	}
}
