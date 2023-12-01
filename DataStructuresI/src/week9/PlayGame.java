package week9;

public class PlayGame {
	// fields
	private Queue<PlayerInterface> players;
	private static HumanPlayer human;
	private static CompPlayer comp;

	// constructors
	public PlayGame(Queue<PlayerInterface> players, HumanPlayer human,
			CompPlayer comp) {
		this.players = players;
		this.human = human;
		this.comp = comp;
	}

	// players turn: sets both the human and comp symbol and calls their
	// turn methods in order of the queue
	// keeps going until there is a winner
	public int turn() {
		char humanPiece = human.getSymbol();
		char compPiece = comp.getSymbol();
		boolean checkWin = false;
		int point = 0;

		//while there is now winner and there is still space
		//it will call the human and comp turns again and again to play the game
		//returns point if human wins
		while (!checkWin && !Board.isBoardFull()){
			if (players.peek() == human) {
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
					point = endGame(human);
					break;
				}
				players.enqueue(human);
				
			} else {
				players.dequeue();
				int[] spot = comp.go();
				System.out.println("Computer goes...");
				Board.board[spot[0]][spot[1]] = compPiece;
				Board.DisplayBoard();
				checkWin = Board.checkWinner(comp.getSymbol(), spot[0], spot[1]);

				if (checkWin) {
					point = endGame(comp);
					break;
				}
				players.enqueue(comp);
			}
				
		}
		//board = full and no winner -> tie
		if (Board.isBoardFull()) {
			System.out.println("Tie! Play again to win!");
		}
		return point;
	}


	// ends the game, displays congrats msg, returns points if human wins
	public static int endGame(PlayerInterface player) {
		int point = 0;
		
		if (player == human) {
			System.out.println("Congratulations! You are the winner!");
			point = 1;
		}
		else if(player == comp){
			System.out.println("Computer wins! Play again to win!");
		}
		return point;
	}
	
}
