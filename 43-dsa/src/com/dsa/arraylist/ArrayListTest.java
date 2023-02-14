package com.dsa.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();		
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
				array.add(sc.nextInt());
				break;
			case 2:
				System.out.print("Enter A Number to Remove: ");
				int x = sc.nextInt();
				for(int i=0;i<array.size();i++)
					if(array.get(i) == x)
						array.remove(i);
				break;
			case 3:
				System.out.print("Enter The index you want to Update: ");
				int y = sc.nextInt();
				System.out.println("Enter the Updated Value: ");
				int input2 = sc.nextInt();
				array.set(y-1, input2);
				break;
			case 4:
				System.out.println("ArrayList: ");
				System.out.println(array);
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}
}