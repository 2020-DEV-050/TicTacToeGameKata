package com.bnpp.kata;

public class TicTacToeGame {
	GameBoard gameBoard;

	public TicTacToeGame() {
		gameBoard = new GameBoard();
	}

	public char getPlayerAt(final int row, final int column) {
		return gameBoard.getSymbolAt(row, column);
	}

	public void play(final int row, final int column) {
		gameBoard.drawSymbolAt(row, column);
	}
}