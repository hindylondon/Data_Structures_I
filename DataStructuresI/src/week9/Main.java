package week9;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//instantiate the scanner
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char playAgain = 'y';
		
		while (playAgain == 'y') {

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
		
		while (symbol != 'x' && symbol != 'o') {
			System.out.println("Invalid symbol.");
			System.out.print("Would you like to be 'X' or 'O'? ");
			symbol = scanner.next().charAt(0);
		}

		//instantiate user and comp player
		HumanPlayer human = new HumanPlayer(symbol);
		CompPlayer comp = new CompPlayer(symbol);

		//put both users onto the queue
		players.enqueue(human);
		players.enqueue(comp);		
		
		//instantiate a new game
		PlayGame game = new PlayGame(players, human, comp);
		
		//start the game, first player goes...
		//adds score if human wins
		score += game.turn();
		
		//asks user if want to play again
		System.out.println("Do you want to play again? (y/n) ");
		playAgain = scanner.next().charAt(0);
		}
		
		//ends game and gives score
		System.out.println("Great Job! You won " + score + " times!");
		System.out.println("Thank you for playing! See you next time!");

	}
}
