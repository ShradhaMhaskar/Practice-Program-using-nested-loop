package com.tka.loop;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		sc.close();
	}

}
