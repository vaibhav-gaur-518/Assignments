package com.monocept.model;

public class Board {
	private char board[][] = new char[3][3];
	private char p1Symbol = 'X', p2Symbol = 'O';
	private int count = 0;
	public final static int p1Wins = 1;
	public final static int p2Wins = 2;
	public final static int draw = 3;
	public final static int INCOMPLETE = 4;
	public final static int INVALID = 5;

	public Board(char p1Symbol, char p2Symbol) {
		// board = new char[boardSize][boardSize];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
		this.p1Symbol = p1Symbol;
		this.p2Symbol = p2Symbol;
	}

	public int move(char symbol, int x, int y) {
		if (x < 0 || x >= 3 || y < 0 || y >= 3 || board[x][y] != ' ') {
			return INVALID;
		}

		board[x][y] = symbol;
		count++;

		if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
			return symbol == p1Symbol ? p1Wins : p2Wins;
		}

		if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
			return symbol == p1Symbol ? p1Wins : p2Wins;
		}

		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return symbol == p1Symbol ? p1Wins : p2Wins;
		}

		if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return symbol == p1Symbol ? p1Wins : p2Wins;
		}

		if (count == 9) {
			return draw;
		}

		return INCOMPLETE;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
				if (j != 3 - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i != 3 - 1) {
				System.out.println("---------");
			}
		}
	}
}
