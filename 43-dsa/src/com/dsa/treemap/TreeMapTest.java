package com.dsa.treemap;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class TreeMapTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer,Integer> treemap = new TreeMap<Integer,Integer>(); 		
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
				System.out.print("Enter A Key to Add: ");
				int key = sc.nextInt();
				System.out.print("Enter A Value to Add: ");
				int value = sc.nextInt();
				treemap.put(key,value);
				break;
			case 2:
				System.out.print("Enter A Key to Remove: ");
				int x = sc.nextInt();
				treemap.remove(x);
				break;
			case 3:
				System.out.print("Enter The Key you want to Update: ");
				int y = sc.nextInt();
				System.out.print("Enter the Updated Value: ");
				int input2 = sc.nextInt();
				//set.stream().map(n->n==y?n=input2:null);
				treemap.replace(y,input2);
				break;
			case 4:
				System.out.println("Tree Map: ");
				for(Entry<Integer, Integer> m : treemap.entrySet())
					System.out.println(m.getKey()+" "+m.getValue());    
				   
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
			}
		}
	}
}

