package com.java.exceptions;

public class Calculator {
	
	private int secret = 42;
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) throws DivisionByZeroException {
		if (y == 0) {
			throw new DivisionByZeroException();
		}
		return x / y;
	}
	
	public boolean checkIfSecretNumber(int x) {
		if (x != secret) {
			throw new NotTheSecretNumberException();
		}
		return true;
	}
	
}
