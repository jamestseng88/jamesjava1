package com.tom;

public class Card {
	String suit = "\u2663\u2666\u2665\u2660";
	int value;

	public Card(int value) {
		this.value = value;
	}

	public String get() {
		int flower = value / 13;
		int num = value % 13 + 1;
		return num + "" + suit.charAt(flower);
	}
}
