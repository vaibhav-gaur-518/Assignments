package com.dsa.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class LinkedHashMapTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashMap<Integer,Integer> hashmap = new LinkedHashMap<Integer,Integer>(); 		
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
				hashmap.put(key,value);
				break;
			case 2:
				System.out.print("Enter A Key to Remove: ");
				int x = sc.nextInt();
				hashmap.remove(x);
				break;
			case 3:
				System.out.print("Enter The Key you want to Update: ");
				int y = sc.nextInt();
				System.out.print("Enter the Updated Value: ");
				int input2 = sc.nextInt();
				//set.stream().map(n->n==y?n=input2:null);
				hashmap.replace(y,input2);
				break;
			case 4:
				System.out.println("Linked Hash Map: ");
				for(Entry<Integer, Integer> m : hashmap.entrySet())
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

