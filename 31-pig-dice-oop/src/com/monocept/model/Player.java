package com.monocept.model;

import java.util.Scanner;

public class Player {
	public static void print() {
		System.out.println("Let's Play PIG!");
		System.out.println("* See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.");
		System.out.println();
		System.out.println("Welcome to the game of Pig!");
	}

	public static void game() {
		int turn = 1, totalScore = 0, turnScore = 0;
		while (true) {
			System.out.println("Turn " + turn + ":");
			System.out.print("Enter 'r' to roll again, 'h' to hold. : ");

			Scanner sc = new Scanner(System.in);
			char input = sc.next().charAt(0);
			if (input == 'r') {
				int random = (int) (Math.random() * (6) + 1);
				System.out.println("You rolled: " + random);
				if (random == 1) {
					turn++;
					System.out.println("Turn over. No Score");
					System.out.println();
					turnScore = 0;
				}
				if (input == 'r' && random != 1) {
					turnScore += random;
					System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
					System.out.println("If you hold, you will have " + turnScore + " points.");
					System.out.println();
				}
			} else {
				if (input == 'h') {
					if(turnScore <= 20)turn++;
					totalScore += turnScore;
					System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
					System.out.println();
					turnScore = 0;
				}
			}
			if(totalScore >= 20) {
				System.out.println("You Win! You finished in "+(turn-1)+" turns!");
				System.out.println();
				System.out.println("Game over!");
				break;
			}
		}
	}
}
