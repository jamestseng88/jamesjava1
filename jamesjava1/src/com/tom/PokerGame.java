package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		for (int a = 0; a < 52; a++) {
		int[] flower = {0x2663 , 0x2666 , 0x2665 , 0x2660};
				System.out.println(flower);}
		
		

		Random random = new Random();
		for (int i = 0; i < 52; i++) {
			int number = random.nextInt(13) + 1;
			System.out.print(number);
			int f = random.nextInt(4) + 1;
			if (f == 1) {
				System.out.println("C");
			} else if (f == 2) {
				System.out.println("S");
			} else if (f == 3) {
				System.out.println("D");
			} else if (f == 4) {
				System.out.println("H");
			}
		}
	}
}