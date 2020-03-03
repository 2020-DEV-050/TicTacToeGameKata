package com.bnpp.kata;

public class GameBoard {
	private static final int THREE = 3;
	private char[][] cells;

	public GameBoard() {
		cells = new char[THREE][THREE];
	}

	public char getSymbolAt(final int row, final int column) {
		return cells[row][column];
	}

	public void drawSymbolAt(final int row, final int column, final char symbol) {
		cells[row][column] = symbol;
	}
}
