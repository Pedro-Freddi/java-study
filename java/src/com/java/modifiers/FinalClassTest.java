package com.java.modifiers;

public class FinalClassTest {

	public static void main(String[] args) {
		
		FinalClass exampleClass = new FinalClass();
		
		System.out.println("Class has a name? " + exampleClass.hasName());
		
		System.out.println("The secret number is: " + exampleClass.SECRET_NUMBER);
		
		// Can't change the secretNumber's value because it is marked as final
		// exampleClass.SECRET_NUMBER = 50; <-- won't compile

	}

}
