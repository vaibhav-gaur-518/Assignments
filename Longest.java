package com.Basic.test;

import java.util.Scanner;

public class Longest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
//		if (n == 1 && arr[0] == 1) {
//			System.out.println(1);
		// } else {
		int maxLength = 0, count = 0,lastIndex = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				count++;
			else {
				if(maxLength < count) {
				maxLength = Math.max(count, maxLength);
				lastIndex = i-1;
				}
				count = 0;
			}
		}
		maxLength = Math.max(count, maxLength);
		System.out.println(maxLength);
		System.out.println(lastIndex);
		// }
	}
}
