package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeGameTest {

	private static final char PLAYER_X = 'X';
	private static final int ZERO = 0;

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() {
		TicTacToeGame game = new TicTacToeGame();

		game.play(ZERO, ZERO, PLAYER_X);

		assertThat(game.getSymbolAt(ZERO, ZERO), CoreMatchers.is(PLAYER_X));
	}

}
