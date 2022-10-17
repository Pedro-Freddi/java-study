package com.java.general;

import java.util.Scanner;

public class LoopsTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String option;
		
		do {
			System.out.println("Input first number: ");
			int x = sc.nextInt();

			System.out.println("Input second number: ");
			int y = sc.nextInt();
			
			int sum = x + y;
			System.out.println("The sum is: " + sum);
			
			System.out.println("Do another sum? (Y / N)");	
			option = sc.next();
			
		} while (option.equals("Y"));
		
		sc.close();
		
		System.out.println("Finished...");
		
	}
}
