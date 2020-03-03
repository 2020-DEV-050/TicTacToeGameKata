package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeGameTest {

	private static final char PLAYER_O = 'O';
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

	@Test
	public void shouldDeclareWinnerWhenAnyOfTheVerticalColumnsAreMarkedBySamePlayer()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, ZERO);
		game.play(TWO, TWO);
		game.play(ONE, ZERO);
		game.play(ONE, TWO);

		assertThat(game.play(TWO, ZERO), CoreMatchers.is(PLAYER_X + GameResultEnum.WINS.value));

	}

	@Test
	public void shouldDeclareWinnerWhenLeftTopToRightBottomDiagonalCellsAreMarkedBySamePlayer()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, ONE);
		game.play(ZERO, ZERO);
		game.play(ONE, TWO);
		game.play(ONE, ONE);
		game.play(TWO, ONE);

		assertThat(game.play(TWO, TWO), CoreMatchers.is(PLAYER_O + GameResultEnum.WINS.value));

	}

	@Test
	public void shouldDeclareWinnerWhenRightToptToLeftBottomDiagonalCellsAreMarkedBySamePlayer()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ZERO, TWO);
		game.play(ZERO, ZERO);
		game.play(ONE, ONE);
		game.play(ONE, TWO);

		assertThat(game.play(TWO, ZERO), CoreMatchers.is(PLAYER_X + GameResultEnum.WINS.value));

	}

	@Test
	public void shouldDeclareGameIsDrawWhenAllTheCellsAreMarkedByPlayers()
			throws CellAlreadyOccupiedException, InvalidCellRangeException {

		game.play(ONE, ONE);
		game.play(ZERO, TWO);
		game.play(ONE, TWO);
		game.play(ONE, ZERO);
		game.play(ZERO, ZERO);
		game.play(TWO, TWO);
		game.play(TWO, ONE);
		game.play(ZERO, ONE);

		assertThat(game.play(TWO, ZERO), CoreMatchers.is(GameResultEnum.DRAW.value));

	}
}
