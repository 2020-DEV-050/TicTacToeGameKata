package com.bnpp.kata;

public class TicTacToeGame {
	GameBoard gameBoard;

	public TicTacToeGame() {
		gameBoard = new GameBoard();
	}

	public char getPlayerAt(final int row, final int column) {
		return gameBoard.getSymbolAt(row, column);
	}

	public void play(final int row, final int column) throws CellAlreadyOccupiedException {
		if (!gameBoard.isCellEmpty(row, column)) {
			throw new CellAlreadyOccupiedException(
					"Given cell is not empty as it is already occupied by another symbol, Please select any other valid cell");
		}
		gameBoard.drawSymbolAt(row, column);
	}
}