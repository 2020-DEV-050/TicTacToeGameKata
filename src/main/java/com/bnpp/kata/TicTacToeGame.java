package com.bnpp.kata;

public class TicTacToeGame {
	GameBoard gameBoard;

	public TicTacToeGame() {
		gameBoard = new GameBoard();
	}

	public char getPlayerAt(final int row, final int column) {
		return gameBoard.getSymbolAt(row, column);
	}

	public String play(final int row, final int column) throws CellAlreadyOccupiedException, InvalidCellRangeException {
		if (!gameBoard.isValidCellRange(row, column)) {
			throw new InvalidCellRangeException(
					"Given cell is out of range, Please select any valid cell in the range of 0 to 2");
		} else if (!gameBoard.isCellEmpty(row, column)) {
			throw new CellAlreadyOccupiedException(
					"Given cell is not empty as it is already occupied by another symbol, Please select any other valid cell");
		}
		gameBoard.drawSymbolAt(row, column);

		if (gameBoard.isAnyHorizontalCellsMarkedBySameSymbol()) {
			return getCurrentPlayer() + GameResultEnum.WINS.value;
		}
		return GameResultEnum.CONTINUES.value;
	}

	private char getCurrentPlayer() {
		return gameBoard.getCurrentSymbol();
	}
}