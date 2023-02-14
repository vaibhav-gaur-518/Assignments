package com.dsa.hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet(); 		
		int input = 0;
		while(input != 5) {
			System.out.println("Enter an Option: ");
			System.out.println("1 -> Add");
			System.out.println("2 -> Remove");
			System.out.println("3 -> Update");
			System.out.println("4 -> Display");
			System.out.println("5 -> Exit");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("Enter A Number to Add: ");
				set.add(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter A Number to Remove: ");
				int x = sc.nextInt();
			
				set.remove(x);
				break;
			case 3:
				System.out.print("Enter The number you want to Update: ");
				int y = sc.nextInt();
				System.out.println("Enter the Updated Value: ");
				int input2 = sc.nextInt();
				set.remove(y);
			    set.add(input2);
				break;
			case 4:
				System.out.println("Hash Set: ");
				System.out.println(set);
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}
}
