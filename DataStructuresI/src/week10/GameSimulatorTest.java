package week10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameSimulatorTest {
	
	GameSimulator game = new GameSimulator(null, null, 0);

	@Test
	void testThatWhenMoreThen3NeighborsCellNeedsToChange() {
		int neighbors = 4;
		Cell cell = new Cell(1, 0, 0);
		assertTrue(GameSimulator.shouldChangeState(4, cell));
	}
	
	@Test
	void testThatWhenLessThen2NeighborsCellNeedsToChange() {
		int neighbors = 1;
		Cell cell = new Cell(1, 0, 0);
		assertTrue(GameSimulator.shouldChangeState(1, cell));
	}
	
	@Test
	void testThatWhenCellIsDeadAndItHasExactly3NeighborsCellNeedsToChange() {
		int neighbors = 3;
		Cell cell = new Cell(0, 0, 0);
		assertTrue(GameSimulator.shouldChangeState(3, cell));
	}

}
