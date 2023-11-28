package week9;

import java.util.*;

public class PlayGame {
	//fields
	private Queue<PlayerInterface> players;
	private Board board;
	private PlayerInterface currentTurn;
	private HumanPlayer human;
	private CompPlayer comp;

	// set getters and setters

	//constructors
	public PlayGame(Queue<PlayerInterface> players, Board board, PlayerInterface currentTurn, HumanPlayer human,
			CompPlayer comp) {
		this.players = players;
		this.board = board;
		this.human = human;
		this.comp = comp;
	}

	//players turn: sets both the human and comp symbol and calls their turn methods in order of the queue
	//keeps going until there is a winner
	public void turn() {
		char humanPiece = human.getSymbol();
		char compPiece = comp.getSymbol();
		boolean checkWin = false;

		do {
			if (currentTurn == human) {
			players.dequeue();
			int[] spot = human.go();
			while (Board.board[spot[0]][spot[1]] != ' ') {
				System.out.println("This spot is taken. Choose another spot.");
				spot = human.go();
			}
			Board.board[spot[0]][spot[1]] = humanPiece;
			Board.DisplayBoard();
			checkWin = Board.checkWinner(human.getSymbol(), spot[0], spot[1]);

			if (checkWin) {
				endGame(human);
			}

			players.enqueue(human);
		} else {
			players.dequeue();
			int[] spot = comp.go();
			
			Board.board[spot[0]][spot[1]] = compPiece;
			Board.DisplayBoard();
			checkWin = Board.checkWinner(human.getSymbol(), spot[0], spot[1]);

			if (checkWin) {
				endGame(human);
			}
			players.enqueue(comp);
		}
		}
		while (checkWin = false && checkEmpty(board));
	}
	
	//checks if the board still has empty spaces
	//if not, will return false and the game will be a draw
	public static boolean checkEmpty(Board board) {
		boolean hasEmpty = false;
		
		for(int i = 0; i < board.getLength(); i++) {
			for (int j = 0; j < board.getLength(); j++) {
				if (Board.board[i][j] == ' ') {
					hasEmpty = true;
					return hasEmpty;
				}
			}
		}
		return hasEmpty;
	}

	//ends the game, displays congrats msg
	//asks the user if he wants to play again
	public static char endGame(PlayerInterface player) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Congratulations! " + player + " is the winner!");
		System.out.println("Do you want to play again? (y/n) ");
		char playAgain = scanner.next().charAt(0);
		scanner.close();
		return playAgain;
	}

}
