package week9;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//instantiate the scanner
		Scanner scanner = new Scanner(System.in);

		//instantiate the board
		Board board = new Board();

		//display the board
		Board.DisplayBoard();

		//display the menu for user to choose to see instructions
		Menu.DisplayMenu(scanner);

		//instantiate the queue to hold who's turn it is
		Queue<PlayerInterface> players = new Queue<PlayerInterface>();

		//ask user for its piece
		System.out.print("Would you like to be 'X' or 'O'? ");
		
		//set piece to be users symbol
		char symbol = scanner.next().charAt(0);
		
		scanner.close();

		//instantiate user and comp player
		HumanPlayer human = new HumanPlayer(symbol);
		CompPlayer comp = new CompPlayer(symbol);

		//put both users onto the queue
		players.enqueue(human);
		players.enqueue(comp);

		//instantiate the top user as the current turn
		PlayerInterface currentTurn = players.peek();

		//instantiate a new game
		PlayGame game = new PlayGame(players, board, currentTurn, human, comp);
		
		//start the game, first player goes...
		game.turn();

	}
}
