package com.dsa.ll;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<Integer>();		
		int input = 0;
		while(input != 4) {
			System.out.println("Enter an Option: ");
			System.out.println("1 -> Add");
			System.out.println("2 -> Remove");
			System.out.println("3 -> Display");
			System.out.println("4 -> Exit");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("Enter A Number to Add: ");
				list.add(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter A Number to Remove: ");
				int x = sc.nextInt();
				for(int i=0;i<list.size();i++)
					if(list.get(i) == x)
						list.remove(i);
				break;
			case 3:
				System.out.println("Linked List: ");
				for(Integer i: list)
					System.out.print(i+" -> ");
				System.out.println();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}
	}
}


