package com.bnpp.kata;

public class TicTacToeGame {

	private char[][] gameBoard = new char[3][3];

	public char getSymbolAt(int row, int column) {
		return gameBoard[row][column];
	}

	public void play(int row, int column, char player) {
		gameBoard[row][column] = player;
	}

}
