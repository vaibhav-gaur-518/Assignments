package com.monocept.test;
import java.util.Scanner;
import com.monocept.model.Board;

public class Runner {
	private Board board;

	public static void main(String args[]) {
		Runner t = new Runner();
		System.out.println("Tic-Tac-Toe Game: ");
		t.startGame();
	}

	public void startGame() {
		Scanner sc = new Scanner(System.in);

		board = new Board('X', 'O');

		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while (status == Board.INCOMPLETE || status == Board.INVALID) {
			if (player1Turn) {
				System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
				int row = sc.nextInt();
				int col = sc.nextInt();
				System.out.println();
				status = board.move('X', row - 1, col - 1);
				if (status != Board.INVALID) {
					player1Turn = false;
					board.print();
				} else {
					System.out.println("Invalid Move !! Try Again !!");
				}
			} else {
				System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
				int row = sc.nextInt();
				int col = sc.nextInt();
				status = board.move('O', row - 1, col - 1);
				if (status != Board.INVALID) {
					player1Turn = true;
					board.print();
				} else {
					System.out.println();
					System.out.println("Invalid Move !! Try Again !!");
				}
			}
		}

		if (status == Board.p1Wins) {
			System.out.println();
			System.out.println("'X' won!!");
		} else if (status == Board.p2Wins) {
			System.out.println();
			System.out.println("'O' won!!");
		} else {
			System.out.println();
			System.out.println("Draw !!");
		}
	}
}
