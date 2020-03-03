package com.bnpp.kata;

public class TicTacToeGame {

	private static final int THREE = 3;
	private char[][] gameBoard;

	public TicTacToeGame() {
		gameBoard = new char[THREE][THREE];
	}

	public char getSymbolAt(final int row, final int column) {
		return gameBoard[row][column];
	}

	public void play(final int row, final int column, final char player) {
		gameBoard[row][column] = player;
	}

}
