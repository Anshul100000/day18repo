package com.bridgelab;

public class TicTacToeuc1 {
	public static void main(String[] args) {
		char[][] gameboard = {
							{' ', '|', ' ', '|', ' '},
							{'-', '+', '-', '+', '-'},
							{' ', '|', ' ', '|', ' '},
							{'-', '+', '-', '+', '-'},
							{' ', '|', ' ', '|', ' '}};
		for(char[] row : gameboard) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
