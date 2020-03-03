package com.bnpp.kata;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class GameBoardTest {

	private static final char SYMBOL_X = 'X';
	private static final int ZERO = 0;

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() {
		GameBoard board = new GameBoard();

		board.drawSymbolAt(ZERO, ZERO);

		assertThat(board.getSymbolAt(ZERO, ZERO), CoreMatchers.is(SYMBOL_X));
	}

	@Test
	public void symbolsShouldGetChangeAlternatively() {
		GameBoard board = new GameBoard();

		board.drawSymbolAt(0, 0);

		assertThat(board.getCurrentSymbol(), CoreMatchers.is(SYMBOL_X));

		board.drawSymbolAt(1, 1);

		assertThat(board.getCurrentSymbol(), CoreMatchers.is('O'));
	}
}
