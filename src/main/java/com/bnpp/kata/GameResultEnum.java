package com.bnpp.kata;

public enum GameResultEnum {
	WINS(" is the Winner!"), CONTINUES(" Game Continues");

	public final String value;

	private GameResultEnum(String value) {
		this.value = value;
	}

}