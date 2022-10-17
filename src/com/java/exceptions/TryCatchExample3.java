package com.java.exceptions;

public class TryCatchExample3 {

	public static void main(String[] args) {
		
		System.out.println("=== BEGIN ===");
		
		Calculator calc = new Calculator();
		
		int x = 50;
		int y = 10;
		int secret = 40;
		
		try {
			
			System.out.println(calc.divide(x, y));
			System.out.println(calc.checkIfSecretNumber(secret));
			
		} catch(DivisionByZeroException e) {
			
			System.err.println("Invalid division by zero");
			
		} catch(NotTheSecretNumberException e) {
			
			System.err.println("That's not the secret number");
			
		} finally {
			
			System.out.println("=== END ===");
			
		}

	}

}
