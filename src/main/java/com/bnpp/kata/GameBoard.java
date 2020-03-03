package com.bnpp.kata;

public class GameBoard {
	private static final int THREE = 3;
	private char[][] cells;
	private char currentSymbol;

	public GameBoard() {
		cells = new char[THREE][THREE];
	}

	public char getSymbolAt(final int row, final int column) {
		return cells[row][column];
	}

	public void drawSymbolAt(final int row, final int column) {
		currentSymbol = getNextSymbol();
		cells[row][column] = currentSymbol;
	}

	private char getNextSymbol() {
		if ('X' == currentSymbol) {
			return 'O';
		} else {
			return 'X';
		}
	}

	public char getCurrentSymbol() {
		return currentSymbol;
	}
}
