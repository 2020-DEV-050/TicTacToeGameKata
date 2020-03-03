package com.bnpp.kata;

public class GameBoard {
	private static final char SYMBOL_O = 'O';
	private static final char SYMBOL_X = 'X';
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
		return SYMBOL_X == currentSymbol ? SYMBOL_O : SYMBOL_X;
	}

	public char getCurrentSymbol() {
		return currentSymbol;
	}
	
	public boolean isCellEmpty(int row, int column) {
		return cells[row][column] == '\0';
	}
}
