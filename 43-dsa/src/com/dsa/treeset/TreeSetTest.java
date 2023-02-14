package com.dsa.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> tree = new TreeSet(); 		
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
				tree.add(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter A Number to Remove: ");
				int x = sc.nextInt();
			
				tree.remove(x);
				break;
			case 3:
				System.out.print("Enter The number you want to Update: ");
				int y = sc.nextInt();
				System.out.println("Enter the Updated Value: ");
				int input2 = sc.nextInt();
				//set.stream().map(n->n==y?n=input2:null);
				tree.remove(y);
				tree.add(input2);
				break;
			case 4:
				System.out.println("Tree Set: ");
				System.out.println(tree);
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}
}
