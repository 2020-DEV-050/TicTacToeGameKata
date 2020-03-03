package com.bnpp.kata;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class GameBoardTest {

	private static final char PLAYER_X = 'X';
	private static final int ZERO = 0;

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() {
		GameBoard board = new GameBoard();

		board.drawSymbolAt(ZERO, ZERO, PLAYER_X);

		assertThat(board.getSymbolAt(ZERO, ZERO), CoreMatchers.is(PLAYER_X));
	}
}
