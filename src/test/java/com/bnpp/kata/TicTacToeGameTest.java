package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeGameTest {

	private static final char PLAYER_X = 'X';
	private static final int ZERO = 0;

	TicTacToeGame game;

	@Before
	public void init() {
		game = new TicTacToeGame();
	}

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() throws CellAlreadyOccupiedException {

		game.play(ZERO, ZERO);

		assertThat(game.getPlayerAt(ZERO, ZERO), CoreMatchers.is(PLAYER_X));
	}

	@Test(expected = CellAlreadyOccupiedException.class)
	public void shouldThroughExceptionWhenPlayerTryToFillInNonEmptyCell() throws CellAlreadyOccupiedException {

		game.play(ZERO, ZERO);
		game.play(ZERO, ZERO);
	}
}
