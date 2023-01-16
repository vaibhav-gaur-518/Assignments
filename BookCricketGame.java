package com.monocept.test;
import java.util.Scanner;

public class BookCricketGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player 1 Name: ");
		String p1 = sc.nextLine();
		System.out.print("Enter Player 2 Name: ");
		String p2 = sc.nextLine();
		
		int max = 300, min = 1;
		int p1Score = 0, p2Score = 0;
		int p1Turns = 0, p2Turns = 0;

		for (int i = 0; i < 2; i++) {
			int score = 0, turns = 0;
			while (true) {
				int random = (int) (Math.random() * max) + min;
				// System.out.println(random);
				int page = random % 7;
				if (page == 0)
					break;
				else {
					score = score + page;
					turns++;
				}
				if (i == 0) {
					System.out.println("Player 1: "+p1);
					System.out.println("Current Page: " + random + " Score: " + score + " Turns: " + turns);
				} else {
					System.out.println("Player 2: "+p2);
					System.out.println("Current Page: " + random + " Score: " + score + " Turns: " + turns);
				}
			}
			if (i == 0) {
				p1Score = score;
				p1Turns = turns;
			} else {
				p2Score = score;
				p2Turns = turns;
			}
		}
		// System.out.println(p1Score + " " + p1Turns + " " + p2Score + " " + p2Turns);
		if (p1Score > p2Score)
			System.out.println("Player 1 Wins The Game");
		else if (p2Score > p1Score)
			System.out.println("Player 2 Wins The Game");
		else if (p1Score == p2Score && p1Turns < p2Turns)
			System.out.println("Player 1 Wins The Game");
		else
			System.out.println("Player 2 Wins The Game");
	}
}