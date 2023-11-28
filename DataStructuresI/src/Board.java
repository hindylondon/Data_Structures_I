package week9;

public class Board {
	//fields
	protected static char[][] board;
	private static int length = 3;

	//constructor, set blank board
	public Board() {
		board = new char[length][length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';
			}
		}
	}
	//getter for length
	public int getLength() {
		return length;
	}

	// display the starting board
	public static void DisplayBoard() {

		// display the board
		System.out.println("---------");

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("|" + board[i][j] + "|");
			}
			System.out.println();
			System.out.print("---------");
			System.out.println();
		}

	}

	//check for winner of game, check horizontal, vertical, and both diagonals, return if there is a winner or not
	public static boolean checkWinner(char symbol, int row, int col) {
		boolean winner = true;

		for (int rowIndex = 0; rowIndex < length; rowIndex++) {
			if (board[row][rowIndex] != symbol) {
				winner = false;
				break;
			}
		}
		if (winner) {
			return true;
		}

		winner = true;

		for (int colIndex = 0; colIndex < length; colIndex++) {
			if (board[colIndex][col] != symbol) {
				winner = false;
				break;
			}
		}
		if (winner) {
			return true;
		}

		if (row == col) {
			winner = true;

			for (int diag = 0; diag < length; diag++) {
				if (board[diag][diag] != symbol) {
					winner = false;
					break;
				}
			}
			if (winner) {
				return true;
			}

		}

		if (row + col == length - 1) {

			winner = true;

			for (int r = 0, c = length - 1; r < length && c < length; r++, c--) {
				if (board[r][c] != symbol) {
					winner = false;
					break;
				}
			}
			if (winner) {
				return true;
			}
		}
		return false;
	}

}
