package com.bnpp.kata;

import java.util.Scanner;
import java.util.logging.Logger;

public class PlayTicTacToe {

	private final static Logger LOGGER = Logger.getLogger(PlayTicTacToe.class.getName());

	public static void main(String[] args) throws CellAlreadyOccupiedException, InvalidCellRangeException {
		playGame();

	}

	 static void playGame() throws CellAlreadyOccupiedException, InvalidCellRangeException {
		Scanner scan = new Scanner(System.in);
		TicTacToeGame game = new TicTacToeGame();
		do {

			game.gameBoard.printBoard();
			int row;
			int col;
			LOGGER.info(
					"Player " + game.gameBoard.getNextSymbol() + ", enter an empty row and column to place your mark!");
			row = scan.nextInt();
			col = scan.nextInt();
			game.play(row, col);
			game.gameBoard.getNextSymbol();
		} while (!game.isWinner() && !game.gameBoard.isCellsFullyOccupiedBySymbols());
		if (game.gameBoard.isCellsFullyOccupiedBySymbols() && !game.isWinner()) {
			LOGGER.info("The game was a tie!");
		} else {
			LOGGER.info("Current board layout:");
			game.gameBoard.printBoard();
			game.gameBoard.getNextSymbol();
			LOGGER.info(Character.toUpperCase(game.gameBoard.getCurrentSymbol()) + " Wins!");
		}
	}

}
