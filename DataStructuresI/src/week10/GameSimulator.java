package week10;

public class GameSimulator {
	// fields
	private Cell[][] grid;
	private CircularQueue<Cell> queue;
	private int size;

	// constructor
	public GameSimulator(Cell[][] grid, CircularQueue<Cell> queue, int size) {
		this.grid = grid;
		this.queue = queue;
		this.size = size;
	}

	// checks if it needs to be changed, and then adds to queue
	public void runIteration() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// set neighbors as count
				int neighbors = countLiveNeighbors(i, j);

				if (shouldChangeState(neighbors, grid[i][j])) {
					queue.enqueue(grid[i][j]);
				}
			}
		}

	}

	// count live neighbors in toroidal grid
	private int countLiveNeighbors(int row, int col) {
		int count = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int neighborRow = (row + i + size) % size;
				int neighborCol = (col + j + size) % size;
				count += grid[neighborRow][neighborCol].getState();
			}
		}
		return count;
	}

	// checks if, based on neighbors it needs to change state
	public static boolean shouldChangeState(int neighbors, Cell cell) {
		return (neighbors > 3 || neighbors < 2 || (cell.getState() == 0 && neighbors == 3));
	}

}
