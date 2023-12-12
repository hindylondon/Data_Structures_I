package week10;

import java.util.Scanner;

public class GameOfLife {
	private static final int MIN_SIMULATION_RUNS = 1;
	private static final int MIN_GRID_SIZE = 20;
	private static final int MAX_GRID_SIZE = 30;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int end;
		// input for how many times to run the simulation
		do {
			System.out.println("How many times do you want to run the simulation? ");
			end = input.nextInt();

			// input val for end
			if (end < MIN_SIMULATION_RUNS) {
				System.out.println("Invalid Entry. Values must be greater then zero.");
			}
		} while (end < MIN_SIMULATION_RUNS);

		// ask user what size board they want
		int size;
		do {
			System.out.println("How many rows do you want in the grid? (20-30) ");
			size = input.nextInt();

			// input val for size
			if (size < MIN_GRID_SIZE || size > MAX_GRID_SIZE) {
				System.out.println("Invalid Entry. Values must be between 20 and 30. ");
			}
		} while (size < MIN_GRID_SIZE || size > MAX_GRID_SIZE);

		input.close();
		
		// initialize grid to inputted size
		Cell[][] grid = new Cell[size][size];

		// instantiate the queue
		CircularQueue<Cell> queue = new CircularQueue<Cell>();

		/// instantiate a board
		Board board = new Board(grid, size, queue);

		// initialize the board
		board.initializeBoard();

		// display blank board
		board.displayBoard();

		GameSimulator game = new GameSimulator(grid, queue, size);

		for (int i = 0; i < end; i++) {
			// run through to see if it needs changing
			game.runIteration();

			// change cells that need changing
			board.updateCellState();

			// display updated board
			board.displayBoard();
		}

	}

}
