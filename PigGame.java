package com.monocept.test;
import java.util.Scanner;

public class PigGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter player 1 Name: ");
		String p1 = sc.nextLine();
		System.out.print("Enter player 2 Name: ");
		String p2 = sc.nextLine();

		int p1Turns = 0,p2Turns = 0;

		for (int i = 0; i < 2; i++) {
			int turn = 1, random = 0, score = 0, finalScore = 0;
			while (finalScore <= 20) {
				System.out.println("Turn " + turn);
				while (finalScore <= 20) {
					System.out.print("Roll or hold? (r/h): ");
					String c = sc.next();
					if (c.equalsIgnoreCase("r")) {
						random = (int) (Math.random() * 6) + 1;
						System.out.println("Die: " + random);
						if (random == 1) {
							score = 0;
							//finalScore = 0;
							turn++;
							System.out.println("Turn over.No score.");
							break;
						} else {
							score = score + random;
							finalScore = finalScore + random;
						}
						if (finalScore >= 20) {
							System.out.println("Turn Score: " + score);
							System.out.println("Total Score: " + finalScore);
							break;
						}
					} else {
						// finalScore = finalScore + score;
						System.out.println("Turn Score: " + score);
						System.out.println("Total Score: " + finalScore);
						turn++;
						score = 0;
						break;
					}
				}
			}
			if(i==0) {
				System.out.println(p1+" taken: "+turn+" Turns\n");
				p1Turns = turn;
			}
			else {
				System.out.println(p2+" taken: "+turn+" Turns\n");
				p2Turns = turn;
			}
		}
		if(p1Turns < p2Turns) System.out.println(p1+ " wins the game");
		else if(p1Turns > p2Turns) System.out.println(p2+" wins the game");
		else System.out.println("The Game Is Tie");
	}
}