package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TicTacToeGameTest {

	@Test
	public void playerOneShouldBeAbleToPlaceXInAnyCell() {
		TicTacToeGame game = new TicTacToeGame();

		game.play(0, 0, 'X');

		assertThat(game.getSymbolAt(0, 0), CoreMatchers.is('X'));
	}

}
