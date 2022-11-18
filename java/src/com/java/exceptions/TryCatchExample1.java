package com.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {

		System.out.println("Input first number: ");
		int x = sc.nextInt();
		
		System.out.println("Input second number: ");
		int y = sc.nextInt();
		
		int division = x / y;
		
		System.out.println("Division of the two numbers is: " + division);
		
		} catch(ArithmeticException e) {
			
			System.err.println("Division error: " + e.getMessage());
			e.printStackTrace();
			
		} catch(InputMismatchException e) {
			
			System.err.println("Input error");
			e.printStackTrace();
			
		} catch(Exception e) {
			
			System.err.println("Unexpected error");
			e.printStackTrace();
			
		} finally {
			
			sc.close();
			
			System.out.println("=== END ===");
			
		}
	}

}
