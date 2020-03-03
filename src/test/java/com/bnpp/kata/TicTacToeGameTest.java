package com.bnpp.kata;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeGameTest {

	private static final char PLAYER_X = 'X';
	private static final int ZERO = 0;

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() throws CellAlreadyOccupiedException {
		TicTacToeGame game = new TicTacToeGame();

		game.play(ZERO, ZERO);

		assertThat(game.getPlayerAt(ZERO, ZERO), CoreMatchers.is(PLAYER_X));
	}

	@Test(expected = CellAlreadyOccupiedException.class)
	public void shouldThroughExceptionWhenPlayerTryToFillInNonEmptyCell() throws CellAlreadyOccupiedException {
		TicTacToeGame game = new TicTacToeGame();

		game.play(ZERO, ZERO);
		game.play(ZERO, ZERO);
	}
}
