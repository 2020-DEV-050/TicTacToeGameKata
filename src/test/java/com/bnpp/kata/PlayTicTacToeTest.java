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
	public void shouldBeAbleToPassInputsInConsoleWhileCallingplayGame()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {
		PlayTicTacToe playTicTacToe = new PlayTicTacToe();
		playTicTacToe.playGame();
	}

	@Test
	public void shouldBeAbleToDisplayInstructions() throws CellAlreadyOccupiedException, InvalidCellRangeException {
		PlayTicTacToe.displayInstructions();
	}

	@Test
	public void instructionsShouldBeDisplayedFirstBeforeStartOfTheGame()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {
		PlayTicTacToe playTicTacToe = new PlayTicTacToe();
		playTicTacToe.playGame();
	}

}
