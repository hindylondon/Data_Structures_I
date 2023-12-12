package week10;

public class Cell {
	//fields
	private int state;
	private int row;
	private int col;
	
	//constructor
	public Cell(int state, int row, int col) {
		this.state = state;
		this.row = row;
		this.col = col;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int newState) {
		state = newState;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}

}
