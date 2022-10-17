package com.java.exceptions;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		
		try {
			
			System.out.println(intArray[8]);
			System.out.println(intArray[12]);
			
			System.out.println("I won't print if there's an error above");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.err.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}
