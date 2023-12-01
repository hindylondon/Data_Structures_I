package week9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	Board board;

	@BeforeEach
	@Test
	//test to see if board is set up
	void testThatNewBoardIsSetUp() {
		board = new Board();
	}
	
	
	@Test
	//tests for diag winner
    public void testCheckWinnerDiag() {
        char symbol = 'X';
        int row = 0;
        int col = 0;

        // Set up a winning condition in the first col
        Board.board[row][col] = symbol;
        Board.board[row + 1][col + 1] = symbol;
        Board.board[row + 2][col + 2] = symbol;

        assertTrue(Board.checkWinner(symbol, row, col));
    }
	
    @Test
    //tests for horiz winner
    public void testCheckWinnerHorizontal() {
        char symbol = 'X';
        int row = 0;
        int col = 0;

        // Set up a winning condition in the first row
        Board.board[row][col] = symbol;
        Board.board[row][col + 1] = symbol;
        Board.board[row][col + 2] = symbol;

        assertTrue(Board.checkWinner(symbol, row, col));
    }
    
    @Test
    //tests for vertic winner
    public void testCheckWinnerVertical() {
        char symbol = 'X';
        int row = 0;
        int col = 0;

        // Set up a winning condition in the first col
        Board.board[row][col] = symbol;
        Board.board[row + 1][col] = symbol;
        Board.board[row + 2][col] = symbol;

        assertTrue(Board.checkWinner(symbol, row, col));
    }
    
    @Test
    //tests for backwards diag winner
    public void testCheckWinnerBackwardsDiag() {
        char symbol = 'X';
        int row = 0;
        int col = 0;

        // Set up a winning condition in the first col
        Board.board[row][col + 2] = symbol;
        Board.board[row + 1][col + 1] = symbol;
        Board.board[row + 2][col] = symbol;

        assertTrue(Board.checkWinner(symbol, row, col));
    }
}
