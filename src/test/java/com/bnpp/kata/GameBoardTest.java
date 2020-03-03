package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class GameBoardTest {

	private static final char SYMBOL_O = 'O';
	private static final int ONE = 1;
	private static final char SYMBOL_X = 'X';
	private static final int ZERO = 0;

	private GameBoard board;

	@Before
	public void init() {
		board = new GameBoard();
	}

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() {

		board.drawSymbolAt(ZERO, ZERO);

		assertThat(board.getSymbolAt(ZERO, ZERO), CoreMatchers.is(SYMBOL_X));
	}

	@Test
	public void symbolsShouldGetChangeAlternatively() {

		board.drawSymbolAt(ZERO, ZERO);

		assertThat(board.getCurrentSymbol(), CoreMatchers.is(SYMBOL_X));

		board.drawSymbolAt(ONE, ONE);

		assertThat(board.getCurrentSymbol(), CoreMatchers.is(SYMBOL_O));
	}

	@Test
	public void shouldReturnTrueWhenInputCellValuesAreInValidRange() {

		assertThat(board.isValidCellRange(0, 1), CoreMatchers.is(true));

	}
	
	@Test
	public void shouldReturnFalseWhenInputCellValuesAreNotInValidRange() {

		assertThat(board.isValidCellRange(3, 1), CoreMatchers.is(false));

	}
}
