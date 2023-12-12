package week10;

import java.util.Random;

public class Board {
	//fields
	private Cell[][] grid;
	private int size;
	private CircularQueue<Cell> queue;
	private static final Random RANDOM = new Random();
	
	//constructor
	public Board(Cell[][] grid, int size, CircularQueue<Cell> queue) {
		this.grid = grid;
		this.size = size;
		this.queue = queue;
	}
	
	//inializes the board, each square is a Cell, sets starting grid randomly
	public void initializeBoard() {
		//initialize each cell in the grid
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				//set each cells state either rand or not 
				int rand = RANDOM.nextInt(2);
				
				//set each cell to its corresp row and col
				int row = i;
				int col = j;
				
				//initialize each Cell w/ state, row, col
				grid[i][j] = new Cell(rand, row, col);		
				
			}
		}
	}
	
	public void updateCellState() {
		//switch all Cell states that is in the Circular Queue
		while(!queue.isEmpty()) {
			Cell curCell = queue.dequeue();
			if (curCell.getState() == 1) {
				curCell.setState(0);
			} else {
				curCell.setState(1);
			}
			}
	}
	
	public void displayBoard() {
		//nested for loop to display appropriate symbol per Cell
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (grid[i][j].getState() == 1) {
					System.out.print("*|");
				}
				else {
					System.out.print(" |");
				}
				
			}
			//display it nicely as a grid
			System.out.println();
			for(int k = 0; k < size; k++) {
				System.out.print("--");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
	}

}
