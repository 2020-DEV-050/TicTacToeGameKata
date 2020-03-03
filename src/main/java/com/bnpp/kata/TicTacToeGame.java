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

		validateInputsToPlayFurther(row, column);

		gameBoard.drawSymbolAt(row, column);

		if (isWinner()) {
			return getCurrentPlayer() + GameResultEnum.WINS.value;
		} else if (gameBoard.isCellsFullyOccupiedBySymbols()) {
			return "Game is Draw";
		}
		return GameResultEnum.CONTINUES.value;
	}

	private void validateInputsToPlayFurther(final int row, final int column)
			throws InvalidCellRangeException, CellAlreadyOccupiedException {
		if (!gameBoard.isValidCellRange(row, column)) {
			throw new InvalidCellRangeException(
					"Given cell is out of range, Please select any valid cell in the range of 0 to 2");
		} else if (!gameBoard.isCellEmpty(row, column)) {
			throw new CellAlreadyOccupiedException(
					"Given cell is not empty as it is already occupied by another symbol, Please select any other valid cell");
		}
	}

	private boolean isWinner() {
		return gameBoard.isAnyHorizontalCellsMarkedBySameSymbol() || gameBoard.isAnyVerticalCellsMarkedBySameSymbol()
				|| gameBoard.isLeftTopToRightBottomDiagonalCellsAreMarkedBySameSymbol()
				|| gameBoard.isRightTopToLeftBottomDiagonalCellsAreMarkedBySameSymbol();
	}

	private char getCurrentPlayer() {
		return gameBoard.getCurrentSymbol();
	}
}