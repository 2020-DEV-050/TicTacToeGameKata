package com.bnpp.kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayTicTacToeTest {

	@Test
	public void playTicTacToeInstanceShouldNotBeNull() {

		PlayTicTacToe playTicTacToe = new PlayTicTacToe();
		assertNotNull(playTicTacToe);
	}

	@Test
	public void shouldBeAbleToDisplayInstructions() throws CellAlreadyOccupiedException, InvalidCellRangeException {
		PlayTicTacToe playTicTacToe = new PlayTicTacToe();

		playTicTacToe.displayInstructions();
	}

}
