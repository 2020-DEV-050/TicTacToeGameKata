package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeGameTest {

	private static final int THREE = 3;
	private static final char PLAYER_X = 'X';
	private static final int ZERO = 0;
	private static final int TWO = 2;
	private static final int ONE = 1;

	TicTacToeGame game;

	@Before
	public void init() {
		game = new TicTacToeGame();
	}

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, ZERO);

		assertThat(game.getPlayerAt(ZERO, ZERO), CoreMatchers.is(PLAYER_X));
	}

	@Test(expected = CellAlreadyOccupiedException.class)
	public void shouldThroughExceptionWhenPlayerTryToFillInNonEmptyCell()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, ZERO);
		game.play(ZERO, ZERO);
	}

	@Test(expected = InvalidCellRangeException.class)
	public void shouldThroughExceptionWhenPlayerTryToFillInACellOutOfRange()
			throws InvalidCellRangeException, CellAlreadyOccupiedException {

		game.play(ZERO, ZERO);
		game.play(THREE, THREE);
	}

	@Test
	public void shouldDeclareWinnerWhenAnyOfTheHorizontalRowsAreMarkedBySamePlayer()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, ZERO);
		game.play(TWO, ONE);
		game.play(ZERO, ONE);
		game.play(ONE, TWO);

		assertThat(game.play(ZERO, TWO), CoreMatchers.is(PLAYER_X + " is the Winner!"));

	}
}
